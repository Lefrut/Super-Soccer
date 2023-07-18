package com.dashkevich.main

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.dashkevich.main.components.MainContent
import com.dashkevich.main.components.MainHeader
import com.dashkevich.main.model.MainNavigation
import com.dashkevich.main.model.MainState
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.CustomTheme

@Composable
fun MainScreen(viewState: MainState, onLeagueClick: (Int) -> Unit, onNavigate: () -> Unit) {
    Scaffold(
        topBar = { MainHeader(headerText = stringResource(R.string.Available_leagues)) },
        containerColor = CustomTheme.colors.surface
    ) { paddings ->
        MainContent(
            modifier = Modifier.padding(paddings),
            viewState,
            onLeagueClick = onLeagueClick
        )
    }
    val nav = viewState.navigation
    LaunchedEffect(nav){
        when(nav){
            is MainNavigation.NavigateToSchedule -> {

                onNavigate()
            }
            MainNavigation.None -> {}
        }
    }
}