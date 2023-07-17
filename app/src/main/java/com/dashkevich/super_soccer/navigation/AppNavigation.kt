package com.dashkevich.super_soccer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.dashkevich.splash.navigation.SPLASH
import com.dashkevich.splash.navigation.splashComposable

@Composable
fun AppNavigation(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = SPLASH){
        splashComposable()
    }
}