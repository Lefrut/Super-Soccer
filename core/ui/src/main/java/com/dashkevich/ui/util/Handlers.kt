package com.dashkevich.ui.util

import androidx.compose.runtime.Composable

@Composable
fun OperationState.stateHandler(
    onLoading: @Composable () -> Unit,
    onSuccess: @Composable () -> Unit,
    onError: @Composable () -> Unit,
    onEmptyResult: @Composable () -> Unit,
) {
    when (this) {
        OperationState.EmptyResult -> {
            onEmptyResult()
        }
        OperationState.Success -> {
            onSuccess()
        }
        OperationState.Error -> {
            onError()
        }
        OperationState.Loading -> {
            onLoading()
        }
        OperationState.None -> {}
    }
}