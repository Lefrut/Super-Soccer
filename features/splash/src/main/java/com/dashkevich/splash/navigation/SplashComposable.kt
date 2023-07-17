package com.dashkevich.splash.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dashkevich.splash.SplashScreen

const val SPLASH = "splash"

inline fun NavGraphBuilder.splashComposable(crossinline onNavigationOperation: () -> Unit){
    composable(SPLASH){
        //viewModel
        //State
        //Events
        SplashScreen(onNavigateOperation = { onNavigationOperation() })
    }
}
