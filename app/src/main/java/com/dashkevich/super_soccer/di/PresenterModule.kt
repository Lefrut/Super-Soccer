package com.dashkevich.super_soccer.di

import com.dashkevich.main.MainViewModel
import com.dashkevich.schedule.ScheduleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModules = module {

    viewModel<MainViewModel>{
        MainViewModel(get(), get())
    }

    viewModel{
        ScheduleViewModel(get())
    }

}