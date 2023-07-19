package com.dashkevich.main.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dashkevich.main.model.MainState
import com.dashkevich.ui.components.EmptyResult
import com.dashkevich.ui.components.Error
import com.dashkevich.ui.components.Loading
import com.dashkevich.ui.util.stateHandler

@Composable
fun MainContent(modifier: Modifier = Modifier, viewState: MainState, onLeagueClick: (Int) -> Unit) {
    Column(modifier = modifier.fillMaxSize()) {
        viewState.leaguesState.stateHandler(
            onLoading = {
                Loading()
            },
            onSuccess = {
                LeaguesList(leagues = viewState.leagues, onLeagueClick = onLeagueClick)
            },
            onError = {
                Error()
            },
            onEmptyResult = {
                EmptyResult()
            }
        )
    }
}