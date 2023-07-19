package com.dashkevich.util

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

fun <T> Result<T>.resultHandler(
    onSuccess: (T) -> Unit,
    onError: (String) -> Unit,
    onEmptyResult: () -> Unit,
) {
    onFailure {
        onError(it.message.toString())
    }
    onSuccess {
        when (it) {
            is Collection<*> -> {
                if (it.isEmpty()) {
                    onEmptyResult()
                } else {
                    onSuccess(it)
                }
            }
            null -> {
                onEmptyResult()
            }
            else -> {
                onSuccess(it)
            }
        }
    }
}

suspend fun <T> coroutineCatching(
    dispatcher: CoroutineDispatcher,
    call: suspend () -> T
): Result<T> = runCatching {
    withContext(dispatcher) {
        call.invoke()
    }
}