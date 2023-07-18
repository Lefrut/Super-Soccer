package com.dashkevich.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.dashkevich.main.components.LeaguesList
import com.dashkevich.main.components.MainHeader
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.CustomTheme

@Composable
fun MainScreen() {
    Scaffold(
        topBar = { MainHeader(headerText = stringResource(R.string.Available_leagues)) },
        containerColor = CustomTheme.colors.surface
    ) {
        Spacer(modifier = Modifier.height(4.dp))
        LeaguesList()
    }
}