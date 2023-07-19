package com.dashkevich.navigation

import androidx.navigation.NavController

fun NavController.navigateToMain() {
    navigate(MAIN) {
        popBackStack()
    }
}

fun NavController.navigateToSchedule(leagueId: Long) {
    navigate("$SCHEDULE/$leagueId")
}

fun NavController.navigateToInternet(){
    navigate(INTERNET)
}