package com.dashkevich.main.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dashkevich.main.model.MainState
import com.dashkevich.ui.components.EmptyResult
import com.dashkevich.ui.components.Error
import com.dashkevich.ui.components.Loading
import com.dashkevich.ui.theme.CustomTheme
import com.dashkevich.ui.util.stateHandler

@Composable
fun MainContent(modifier: Modifier = Modifier, uiState: MainState) {
    Column(modifier = modifier.fillMaxSize()) {
        uiState.leaguesState.stateHandler(
            onLoading = {
                Loading()
            },
            onSuccess = {
                LeaguesList(leagues = uiState.leagues)
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