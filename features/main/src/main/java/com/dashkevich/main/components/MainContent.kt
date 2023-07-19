package com.dashkevich.main.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.dashkevich.main.model.MainState
import com.dashkevich.ui.R
import com.dashkevich.ui.components.EmptyResult
import com.dashkevich.ui.components.Error
import com.dashkevich.ui.components.Loading
import com.dashkevich.ui.components.SportButton
import com.dashkevich.ui.util.stateHandler

@Composable
fun MainContent(
    modifier: Modifier = Modifier,
    viewState: MainState,
    onLeagueClick: (Long) -> Unit,
    onButtonClick: () -> Unit
) {
    Column(modifier = modifier.fillMaxSize()) {
        viewState.leaguesState.stateHandler(
            onLoading = {
                Loading()
            },
            onSuccess = {
                LeaguesList(leagues = viewState.leagues, onLeagueClick = onLeagueClick)
            },
            onError = {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
                    SportButton(
                        modifier = Modifier.padding(20.dp),
                        onClick = { onButtonClick() },
                        text = stringResource(R.string.load_data_last)
                    )
                    Error(str = stringResource(R.string.Error))
                }
            },
            onEmptyResult = {
                EmptyResult()
            }
        )
    }
}