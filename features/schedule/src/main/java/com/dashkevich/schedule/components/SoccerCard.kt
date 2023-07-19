package com.dashkevich.schedule.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dashkevich.domain.model.TopSoccer
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.CustomTheme


const val three = 3


@Composable
fun SoccerCard(soccer: TopSoccer) {
    Card(
        modifier = Modifier
            .padding(horizontal = 14.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = CustomTheme.colors.primary),
        elevation = CardDefaults.cardElevation(1.dp),
    ) {
        val textStyle =
            CustomTheme.fonts.headline5.copy(textAlign = TextAlign.Start, fontSize = 14.sp)
        val textModifier = Modifier.padding(horizontal = 5.dp, vertical = 4.dp)
        Text(
            text = stringResource(R.string.soccer_name) + " " + soccer.playerName,
            color = CustomTheme.colors.onSurfaceVariant,
            style = textStyle,
            maxLines = three,
            modifier = textModifier
        )
        Text(
            text = stringResource(R.string.soccer_goals) + " " + soccer.goals,
            color = CustomTheme.colors.onSurfaceVariant,
            style = textStyle,
            maxLines = three,
            modifier = textModifier
        )
        Text(
            text = stringResource(R.string.soccer_team_name) + " " + soccer.teamName,
            color = CustomTheme.colors.onSurfaceVariant,
            style = textStyle,
            maxLines = three,
            modifier = textModifier
        )
    }
}