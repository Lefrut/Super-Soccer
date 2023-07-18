package com.dashkevich.schedule.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dashkevich.navigation.SCHEDULE
import com.dashkevich.schedule.ScheduleScreen

fun NavGraphBuilder.scheduleComposable(navController: NavController){
    composable(SCHEDULE){
        ScheduleScreen()
    }
}