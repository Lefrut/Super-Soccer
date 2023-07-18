package com.dashkevich.main.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.dashkevich.main.MainScreen
import com.dashkevich.navigation.MAIN

fun NavGraphBuilder.mainComposable(navController: NavController){
    composable(MAIN){
        MainScreen()
    }
}