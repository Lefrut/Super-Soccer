package com.dashkevich.schedule.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dashkevich.schedule.model.ScheduleState

@Composable
fun ScheduleList(modifier: Modifier,viewState: ScheduleState) {
    val topSoccer = viewState.soccerList
    LazyColumn(modifier = modifier.fillMaxSize()){
        items(topSoccer) { soccer ->
            Spacer(modifier = Modifier.height(10.dp))
            SoccerCard(soccer = soccer)
        }
        item {
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}