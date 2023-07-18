package com.dashkevich.main.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        LeaguesList()
    }
}