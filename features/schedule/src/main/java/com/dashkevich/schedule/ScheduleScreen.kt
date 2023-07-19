package com.dashkevich.schedule

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.dashkevich.schedule.components.ScheduleList
import com.dashkevich.schedule.components.ScheduleTopBar
import com.dashkevich.schedule.model.ScheduleState
import com.dashkevich.ui.R
import com.dashkevich.ui.components.EmptyResult
import com.dashkevich.ui.components.Error
import com.dashkevich.ui.components.Loading
import com.dashkevich.ui.util.stateHandler

@Composable
fun ScheduleScreen(
    viewState: ScheduleState,
    onLoadTopSoccer: (Long) -> Unit,
    onChangeField: (String) -> Unit,
) {
    Scaffold(
        topBar = {
            ScheduleTopBar(viewState, onChangeField, onLoadTopSoccer)
        }
    ) { paddings ->
        viewState.soccerListState.stateHandler(
            onLoading = {
                Loading()
            },
            onSuccess = {
                ScheduleList(modifier = Modifier.padding(paddings), viewState = viewState)
            },
            onError = {
                Error(
                    str = stringResource(R.string.server_error)
                )

            },
            onEmptyResult = {
                EmptyResult()
            }
        )
    }
}