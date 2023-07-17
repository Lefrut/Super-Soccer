package com.dashkevich.splash.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dashkevich.navigation.SPLASH
import com.dashkevich.navigation.navigateToMain
import com.dashkevich.splash.SplashScreen

fun NavGraphBuilder.splashComposable(navController: NavController) {
    composable(SPLASH) {
        //viewModel
        //State
        //Events
        SplashScreen(onNavigateOperation = { navController.navigateToMain { popUpTo(SPLASH) } })
    }
}
