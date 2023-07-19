package com.dashkevich.super_soccer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.dashkevich.internet.navigation.internetComposable
import com.dashkevich.main.navigation.mainComposable
import com.dashkevich.navigation.SPLASH
import com.dashkevich.schedule.navigation.scheduleComposable
import com.dashkevich.splash.navigation.splashComposable

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SPLASH){
        splashComposable(navController)
        mainComposable(navController)
        scheduleComposable(navController)
        internetComposable(navController)
    }
}