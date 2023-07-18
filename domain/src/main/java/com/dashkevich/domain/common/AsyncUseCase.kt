package com.dashkevich.domain.common

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

abstract class AsyncUseCase(
    dispatcher: CoroutineDispatcher = Dispatchers.IO
): UseCase {
    var dispatcher = dispatcher
    protected set
}