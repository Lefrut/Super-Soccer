package com.dashkevich.super_soccer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.dashkevich.super_soccer.navigation.AppNavigation
import com.dashkevich.ui.theme.CustomTheme
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