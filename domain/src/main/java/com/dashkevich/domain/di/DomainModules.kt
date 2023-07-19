package com.dashkevich.domain.di

import com.dashkevich.domain.use_case.LoadLastLeaguesUseCase
import com.dashkevich.domain.use_case.LoadLeaguesUseCase
import com.dashkevich.domain.use_case.LoadTopSoccerUseCase
import org.koin.dsl.module

val useCaseModule = module {

    single {
        LoadLeaguesUseCase(get(), get())
    }
    single {
        LoadTopSoccerUseCase(get())
    }
    single {
        LoadLastLeaguesUseCase(get())
    }
}

val domainModules = module {
    includes(useCaseModule)
}

