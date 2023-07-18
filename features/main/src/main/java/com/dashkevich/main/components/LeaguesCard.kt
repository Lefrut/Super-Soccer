package com.dashkevich.main.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.dashkevich.main.model.LeagueUI
import com.dashkevich.ui.theme.CustomTheme

private val fourDp = 4.dp
private const val two = 2

@Composable
fun LeaguesCard(modifier: Modifier = Modifier, leagueUI: LeagueUI) {
    Card(
        modifier = Modifier
            .padding(horizontal = 14.dp)
            .fillMaxWidth()
            .height(140.dp),
        colors = CardDefaults.cardColors(containerColor = CustomTheme.colors.primary),
        shape = RoundedCornerShape(CustomTheme.shapes.default),
        elevation = CardDefaults.cardElevation(fourDp, fourDp, fourDp, fourDp, fourDp, fourDp),
    ) {
        LeaguesCardContent(leagueUI = leagueUI)
    }
}

@Composable
fun LeaguesCardContent(modifier: Modifier = Modifier, leagueUI: LeagueUI) {
    val imageModifier = Modifier
        .padding(start = 10.dp)
        .size(50.dp)
        .clip(CircleShape)
    Box(modifier = modifier.padding(end = 10.dp).fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
            AsyncImage(
                modifier = imageModifier,
                model = leagueUI.logo, contentDescription = null,
                contentScale = ContentScale.Crop,
                alignment = Alignment.CenterStart
            )
            Spacer(modifier = Modifier.height(3.dp))
            AsyncImage(
                modifier = imageModifier,
                model = leagueUI.countyLogo, contentDescription = null,
                contentScale = ContentScale.Crop,
                alignment = Alignment.CenterStart
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .align(Alignment.Center)
        ) {
            Text(
                text = leagueUI.name,
                color = CustomTheme.colors.onSurfaceVariant,
                style = CustomTheme.fonts.headline3,
                maxLines = two
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = leagueUI.countryName,
                color = CustomTheme.colors.onSurfaceVariant,
                style = CustomTheme.fonts.headline5,
                maxLines = two
            )
        }
    }
}