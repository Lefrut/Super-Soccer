package com.dashkevich.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.CustomTheme

@Composable
fun MainHeader(modifier: Modifier = Modifier, headerText: String) {
    Box(
        modifier = modifier.fillMaxWidth()
            .height(60.dp)
            .background(color = CustomTheme.colors.surface)
    ) {
        Text(
            text = headerText,
            color = CustomTheme.colors.onSurface,
            style = CustomTheme.fonts.header,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 20.dp),
        )
    }
}