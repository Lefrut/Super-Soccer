package com.dashkevich.super_soccer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dashkevich.super_soccer.navigation.AppNavigation
import com.dashkevich.ui.theme.SuperSoccerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperSoccerTheme {
                AppNavigation()
            }
        }
    }
}