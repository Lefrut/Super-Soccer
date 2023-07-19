package com.dashkevich.main

import androidx.lifecycle.viewModelScope
import com.dashkevich.domain.use_case.LoadLastLeaguesUseCase
import com.dashkevich.domain.use_case.LoadLeaguesUseCase
import com.dashkevich.main.model.MainNavigation
import com.dashkevich.main.model.MainState
import com.dashkevich.ui.util.OperationState
import com.dashkevich.util.common.BaseViewModel
import com.dashkevich.util.resultHandler
import kotlinx.coroutines.launch

class MainViewModel(
    private val loadLeaguesUseCase: LoadLeaguesUseCase,
    private val loadLastLeaguesUseCase: LoadLastLeaguesUseCase
) : BaseViewModel<MainState>() {
    override fun setModel(): MainState = MainState()

    init {
        loadLeagues()
    }

    fun navigateToSchedule(idLeague: Long) {
        setState {
            copy(navigation = MainNavigation.NavigateToSchedule(idLeague))
        }
    }

    fun leaveScreen() {
        setState {
            copy(navigation = MainNavigation.None)
        }
    }

    private fun loadLeagues() = viewModelScope.launch {
        fun loading() = setState { copy(leaguesState = OperationState.Loading) }

        loading()
        loadLeaguesUseCase().resultHandler(
            onSuccess = { leagues ->
                setState {
                    copy(leagues = leagues, leaguesState = OperationState.Success)
                }
            },
            onEmptyResult = {
                setState {
                    copy(leaguesState = OperationState.EmptyResult)
                }
            },
            onError = {
                setState {
                    copy(leaguesState = OperationState.Error)
                }
            }
        )
    }

    fun loadLastLeagues() = viewModelScope.launch {
        loadLastLeaguesUseCase().resultHandler(
            onSuccess = { leagues ->
                setState {
                    copy(leagues = leagues, leaguesState = OperationState.Success)
                }
            },
            onEmptyResult = {
                setState {
                    copy(leaguesState = OperationState.EmptyResult)
                }
            },
            onError = {
                setState {
                    copy(leaguesState = OperationState.Error)
                }
            }

        )
    }

}