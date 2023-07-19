package com.dashkevich.schedule.model

import com.dashkevich.domain.model.TopSoccer
import com.dashkevich.ui.util.OperationState

data class ScheduleState(
    val soccerList: List<TopSoccer> = emptyList(),
    val soccerListState: OperationState = OperationState.None,
    val fieldId: String = ""
)
