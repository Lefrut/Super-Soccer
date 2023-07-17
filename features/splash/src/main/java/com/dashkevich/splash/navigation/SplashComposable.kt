package com.dashkevich.splash.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dashkevich.splash.SplashScreen

const val SPLASH = "splash"

fun NavGraphBuilder.splashComposable(){
    composable(SPLASH){
        //viewModel
        //State
        //Events
        SplashScreen()
    }
}
