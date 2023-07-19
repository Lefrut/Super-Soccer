package com.dashkevich.schedule.navigation

import androidx.activity.ComponentActivity
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.dashkevich.navigation.LEAGUE_ID
import com.dashkevich.navigation.SCHEDULE
import com.dashkevich.schedule.ScheduleScreen
import com.dashkevich.schedule.ScheduleViewModel
import com.dashkevich.schedule.model.ScheduleState
import com.dashkevich.ui.util.OperationState
import org.koin.androidx.viewmodel.ext.android.viewModel

fun NavGraphBuilder.scheduleComposable(navController: NavController) {
    composable(
        route = "$SCHEDULE/{$LEAGUE_ID}",
        arguments = listOf(
            navArgument(LEAGUE_ID) { type = NavType.LongType }
        )
    ) {
        val id = it.arguments?.getLong(LEAGUE_ID)
        val componentActivity = (LocalContext.current as ComponentActivity)
        val scheduleViewModel: ScheduleViewModel by componentActivity.viewModel()
        val viewState: ScheduleState by scheduleViewModel.viewState.collectAsState()
        ScheduleScreen(
            viewState = viewState,
            onLoadTopSoccer = { leagueId -> scheduleViewModel.getTopSoccer(leagueId) },
            onChangeField = { str -> scheduleViewModel.changeField(str) }
        )

        LaunchedEffect(Unit) {
            if(viewState.soccerListState == OperationState.None) {
                argEffect(
                    arg = id, onError = { scheduleViewModel.error() },
                    onSuccess = { value ->
                        value?.let { v -> scheduleViewModel.getTopSoccer(v) }
                    }
                )
            }
            scheduleViewModel.changeField(id.toString())
        }
    }
}

private fun<T> argEffect(arg: T, onError: () -> Unit, onSuccess: (T) -> Unit){
    if (arg == null) {
        onError()
    } else {
        onSuccess(arg)
    }
}