package com.dashkevich.internet.navigation

import android.app.Activity
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.dashkevich.internet.InternetScreen
import com.dashkevich.navigation.INTERNET

fun NavGraphBuilder.internetComposable(navHostController: NavHostController) {
    composable(INTERNET){

        InternetScreen()

    }
}