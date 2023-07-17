package com.dashkevich.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowInsetsControllerCompat
import com.dashkevich.ui.theme.model.CustomColorScheme
import com.dashkevich.ui.theme.model.CustomShapes
import com.dashkevich.ui.theme.model.CustomTypography


@Composable
fun SuperSoccerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    val window = (view.context as Activity).window
    if (!view.isInEditMode) {
        SideEffect {
            val wic = WindowInsetsControllerCompat(window, window.decorView)
            window.statusBarColor = colorScheme.surface.toArgb()
            window.navigationBarColor = colorScheme.surface.toArgb()
            wic.isAppearanceLightStatusBars = darkTheme
            wic.isAppearanceLightNavigationBars = darkTheme
        }
    }
    CompositionLocalProvider(
        LocalColorProvider provides colorScheme,
        LocalShapeProvider provides shapes,
        LocalTypographyProvider provides typography,
        content = content
    )

}

object CustomTheme {
    val colors: CustomColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorProvider.current

    val shapes: CustomShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapeProvider.current

    val fonts: CustomTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypographyProvider.current
}

val LocalColorProvider = staticCompositionLocalOf<CustomColorScheme> {
    error("No colors")
}

val LocalShapeProvider = staticCompositionLocalOf<CustomShapes> {
    error("No shapes")
}

val LocalTypographyProvider = staticCompositionLocalOf<CustomTypography> {
    error("No fonts")
}