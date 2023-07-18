package com.dashkevich.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.dashkevich.main.components.MainContent
import com.dashkevich.main.components.MainHeader
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.CustomTheme

@Composable
fun MainScreen() {
    Scaffold(
        topBar = { MainHeader(headerText = stringResource(R.string.Available_leagues)) },
        containerColor = CustomTheme.colors.surface
    ) { paddings ->
        MainContent(modifier = Modifier.padding(paddings))
    }
}