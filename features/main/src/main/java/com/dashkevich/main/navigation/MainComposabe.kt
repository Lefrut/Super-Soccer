package com.dashkevich.main.navigation

import android.app.Activity
import androidx.activity.ComponentActivity
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dashkevich.main.MainScreen
import com.dashkevich.main.MainViewModel
import com.dashkevich.navigation.MAIN
import org.koin.androidx.viewmodel.ext.android.viewModel


fun NavGraphBuilder.mainComposable(navController: NavController) {
    composable(MAIN) {
        val componentActivity = (LocalContext.current as ComponentActivity)
        val mainViewModel: MainViewModel by componentActivity.viewModel<MainViewModel>()
        val viewState = mainViewModel.viewState.collectAsState().value
        MainScreen(viewState)
    }
}