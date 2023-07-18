package com.dashkevich.super_soccer.di

import org.koin.dsl.module

internal val appModule = module {
    includes(viewModelModules)
}