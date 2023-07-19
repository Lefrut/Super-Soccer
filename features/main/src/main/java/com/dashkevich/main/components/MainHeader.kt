package com.dashkevich.main.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dashkevich.main.R
import com.dashkevich.ui.theme.CustomTheme

@Composable
fun MainHeader(modifier: Modifier = Modifier, headerText: String, onIconClick: () -> Unit) {
    Box(
        modifier = modifier
            .fillMaxWidth()
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
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_public_24), contentDescription = null,
            modifier = Modifier
                .padding(end = 20.dp)
                .align(Alignment.CenterEnd)
                .size(30.dp)
                .clickable {
                    onIconClick()
                }
        )
    }
}