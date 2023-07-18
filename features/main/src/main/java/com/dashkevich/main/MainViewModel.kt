package com.dashkevich.main

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.dashkevich.domain.use_case.LoadLeaguesUseCase
import com.dashkevich.main.model.MainState
import com.dashkevich.util.common.BaseViewModel
import com.dashkevich.ui.util.OperationState
import com.dashkevich.util.resultHandler
import kotlinx.coroutines.launch

class MainViewModel(
    private val loadLeaguesUseCase: LoadLeaguesUseCase
) : BaseViewModel<MainState>() {
    override fun setModel(): MainState = MainState()

    init {
        loadLeagues()
    }

    private fun loadLeagues() = viewModelScope.launch {
        fun loading() = setState {
            copy(leaguesState = OperationState.Loading)
        }
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

}