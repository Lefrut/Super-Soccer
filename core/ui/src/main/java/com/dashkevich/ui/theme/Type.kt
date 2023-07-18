package com.dashkevich.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.model.CustomTypography

internal val typography = CustomTypography(
    header = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(Font(R.font.inter_bold)),
        fontWeight = FontWeight(700),
    )
)