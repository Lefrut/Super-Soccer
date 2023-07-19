package com.dashkevich.internet.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dashkevich.internet.InternetScreen
import com.dashkevich.navigation.INTERNET

fun NavGraphBuilder.internetComposable(){
    composable(INTERNET){

        InternetScreen()
    }
}