package com.dashkevich.super_soccer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.dashkevich.super_soccer.navigation.AppNavigation
import com.dashkevich.super_soccer.ui.theme.SuperSoccerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperSoccerTheme {
                val navHostController = rememberNavController()
                AppNavigation(navHostController = navHostController)
            }
        }
    }
}