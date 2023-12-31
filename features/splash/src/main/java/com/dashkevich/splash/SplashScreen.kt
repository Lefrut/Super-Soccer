package com.dashkevich.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dashkevich.ui.theme.CustomTheme
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNavigateOperation: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = CustomTheme.colors.primary),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.size(100.dp),
            painter = painterResource(id = R.drawable.ball),
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
    }
    LaunchedEffect(Unit) {
        delay(1000)
        onNavigateOperation()
    }

}