package com.dashkevich.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.dashkevich.main.components.MainContent
import com.dashkevich.main.components.MainHeader
import com.dashkevich.main.model.MainNavigation
import com.dashkevich.main.model.MainState
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.CustomTheme

@Composable
fun MainScreen(
    viewState: MainState,
    onLeagueClick: (Long) -> Unit,
    onNavigate: (Long) -> Unit,
    onButtonClick: () -> Unit,
    onNavigateToInternet: () -> Unit
) {
    Scaffold(
        topBar = {
            MainHeader(headerText = stringResource(R.string.Available_leagues), onIconClick = {
                onNavigateToInternet()
            })
        },
        containerColor = CustomTheme.colors.surface
    ) { paddings ->
        MainContent(
            modifier = Modifier.padding(paddings),
            viewState = viewState,
            onLeagueClick = onLeagueClick,
            onButtonClick = onButtonClick
        )
    }
    val nav = viewState.navigation
    LaunchedEffect(nav) {
        when (nav) {
            is MainNavigation.NavigateToSchedule -> {
                onNavigate(nav.leagueId)
            }
            MainNavigation.None -> {}
        }
    }
}