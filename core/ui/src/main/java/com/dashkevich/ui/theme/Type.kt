package com.dashkevich.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.model.CustomTypography

internal val typography = CustomTypography(
    header = TextStyle(
        fontSize = 22.sp,
        fontFamily = FontFamily(Font(R.font.inter_bold)),
        fontWeight = FontWeight(700),
    ),
    headline3 = TextStyle(
        fontSize = 20.sp,
        fontFamily = FontFamily(Font(R.font.poppins_extrabold)),
        fontWeight = FontWeight(800),
        letterSpacing = 1.sp,
        textAlign = TextAlign.Center
    ),
    headline5 = TextStyle(
        fontSize = 18.sp,
        fontFamily = FontFamily(Font(R.font.poppins_medium)),
        fontWeight = FontWeight(500),
        letterSpacing = 1.sp,
        textAlign = TextAlign.Center
    ),
)