package com.dashkevich.main.model

import com.dashkevich.domain.model.League
import com.dashkevich.ui.util.OperationState

data class MainState(
    val leagues: List<League> = emptyList(),
    val leaguesState: OperationState = OperationState.None,
    val navigation: MainNavigation = MainNavigation.None
)

sealed class MainNavigation{
    object None: MainNavigation()
    class NavigateToSchedule(val leagueId: Long): MainNavigation()
}
