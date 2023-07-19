package com.dashkevich.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dashkevich.ui.theme.CustomTheme

@Composable
fun SportButton(onClick: () -> Unit, text: String, modifier: Modifier = Modifier) {
    Button(
        elevation = ButtonDefaults.buttonElevation(2.dp),
        onClick = {
            onClick()
        },
        content = {
            Text(
                text = text,
                style = CustomTheme.fonts.header
            )
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = CustomTheme.colors.primary,
            disabledContainerColor = CustomTheme.colors.primary,
            contentColor = CustomTheme.colors.onSurfaceVariant,
            disabledContentColor = CustomTheme.colors.onSurfaceVariant
        )
    )
}