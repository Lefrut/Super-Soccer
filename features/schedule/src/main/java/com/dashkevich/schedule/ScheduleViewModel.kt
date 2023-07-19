package com.dashkevich.schedule

import androidx.lifecycle.viewModelScope
import com.dashkevich.domain.use_case.LoadTopSoccerUseCase
import com.dashkevich.schedule.model.ScheduleState
import com.dashkevich.ui.util.OperationState
import com.dashkevich.util.common.BaseViewModel
import com.dashkevich.util.resultHandler
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ScheduleViewModel(private val loadTopSoccerUseCase: LoadTopSoccerUseCase) :
    BaseViewModel<ScheduleState>() {
    override fun setModel(): ScheduleState = ScheduleState()

    private val dispatcher: CoroutineDispatcher = Dispatchers.Default

    fun getTopSoccer(leagueId: Long) = viewModelScope.launch(dispatcher) {
        setState {
            copy(soccerListState = OperationState.Loading, fieldId = leagueId.toString())
        }
        loadTopSoccerUseCase(leagueId).resultHandler(
            onSuccess = { topSoccer ->
                setState {
                    copy(soccerList = topSoccer, soccerListState = OperationState.Success)
                }
            },
            onError = { _ ->
                setState {
                    copy(soccerListState = OperationState.Error)
                }
            },
            onEmptyResult = {
                setState {
                    copy(soccerListState = OperationState.EmptyResult)
                }
            }
        )
    }

    fun error(){
        setState {
            copy(soccerListState = OperationState.Error)
        }
    }

    fun changeField(str: String){
        setState {
            copy(fieldId = str)
        }
    }


}