package com.dashkevich.main.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dashkevich.main.util.dataLeaguesUI

private val spaceHeight = 10.dp

@Composable
fun LeaguesList(modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(dataLeaguesUI) { league ->
            Spacer(modifier = Modifier.height(14.dp))
            LeaguesCard(leagueUI = league)
        }
        item {
            Spacer(modifier = Modifier.height(spaceHeight))
        }
    }
}