package com.dashkevich.domain.di

import com.dashkevich.domain.use_case.LoadLeaguesUseCase
import org.koin.dsl.module

val useCaseModule = module {

    single {
        LoadLeaguesUseCase(get())
    }
}

val domainModules = module {
    includes(useCaseModule)
}

