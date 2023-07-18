package com.dashkevich.schedule.navigation

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.dashkevich.navigation.LEAGUE_ID
import com.dashkevich.navigation.SCHEDULE
import com.dashkevich.schedule.ScheduleScreen

fun NavGraphBuilder.scheduleComposable(navController: NavController) {
    composable(
        route = "$SCHEDULE/{$LEAGUE_ID}",
        arguments = listOf(
            navArgument(LEAGUE_ID) { type = NavType.IntType }
        )
    ) {
        val id = it.arguments?.getInt(LEAGUE_ID)
        ScheduleScreen()
    }
}