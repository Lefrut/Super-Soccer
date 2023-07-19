package com.dashkevich.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.CustomTheme

@Composable
fun Error(str: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = str,
            color = CustomTheme.colors.highlighting,
            style = CustomTheme.fonts.headline3,
            maxLines = 10
        )
    }
}