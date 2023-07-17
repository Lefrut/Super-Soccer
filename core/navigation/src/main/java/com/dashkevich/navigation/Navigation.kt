package com.dashkevich.navigation

import androidx.navigation.NavController
import androidx.navigation.NavOptionsBuilder

fun NavController.navigateToMain(builder: NavOptionsBuilder.() -> Unit) {
    navigate(MAIN) {
        builder()
    }
}