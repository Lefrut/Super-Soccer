package com.dashkevich.main.components

import android.util.Log
import androidx.compose.foundation.clickable
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
import com.dashkevich.domain.model.League
import com.dashkevich.ui.theme.CustomTheme

private val fourDp = 4.dp
private const val two = 2

@Composable
fun LeaguesCard(modifier: Modifier = Modifier, league: League, onLeagueClick: (Int) -> Unit) {
    Card(
        modifier = modifier
            .padding(horizontal = 14.dp)
            .fillMaxWidth()
            .height(140.dp)
            .clickable {
                onLeagueClick(league.leagueId)
            },
        colors = CardDefaults.cardColors(containerColor = CustomTheme.colors.primary),
        shape = RoundedCornerShape(CustomTheme.shapes.default),
        elevation = CardDefaults.cardElevation(fourDp, fourDp, fourDp, fourDp, fourDp, fourDp),
    ) {
        LeaguesCardContent(league = league)
    }
}

@Composable
fun LeaguesCardContent(modifier: Modifier = Modifier, league: League) {
    val imageModifier = Modifier
        .padding(start = 10.dp)
        .size(50.dp)
        .clip(CircleShape)
    Row(modifier = modifier
        .padding(end = 10.dp)
        .fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
            AsyncImage(
                modifier = imageModifier,
                model = league.leagueLogo, contentDescription = null,
                contentScale = ContentScale.Crop,
                alignment = Alignment.CenterStart
            )
            Spacer(modifier = Modifier.height(3.dp))
            AsyncImage(
                modifier = imageModifier,
                model = league.countryLogo, contentDescription = null,
                contentScale = ContentScale.Crop,
                alignment = Alignment.CenterStart
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(10.dp)
                .fillMaxHeight()
        ) {
            Text(
                text = league.leagueName,
                color = CustomTheme.colors.onSurfaceVariant,
                style = CustomTheme.fonts.headline3,
                maxLines = two
            )
            Spacer(modifier = Modifier.height(3.dp))
            Text(
                text = league.countryName,
                color = CustomTheme.colors.onSurfaceVariant,
                style = CustomTheme.fonts.headline5,
                maxLines = two
            )
        }
    }
}