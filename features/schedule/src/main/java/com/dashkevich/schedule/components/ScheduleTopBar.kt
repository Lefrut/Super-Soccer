package com.dashkevich.schedule.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dashkevich.schedule.model.ScheduleState
import com.dashkevich.ui.R
import com.dashkevich.ui.theme.CustomTheme

@Composable
fun ScheduleTopBar(
    viewState: ScheduleState,
    onChangeField: (String) -> Unit,
    onLoadTopSoccer: (Long) -> Unit
) {
    Column(
        modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(R.string.id_league),
            color = CustomTheme.colors.onSurface,
            style = CustomTheme.fonts.header,
            modifier = Modifier,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(3.dp))
        TextField(
            value = viewState.fieldId,
            onValueChange = onChangeField,
            textStyle = CustomTheme.fonts.headline3,
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = CustomTheme.colors.onSurfaceVariant,
                disabledIndicatorColor = CustomTheme.colors.onSurfaceVariant,
                errorIndicatorColor = CustomTheme.colors.onSurfaceVariant,
                unfocusedIndicatorColor = CustomTheme.colors.onSurfaceVariant,
                disabledContainerColor = Color.Transparent,
                errorContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent
            ),
        )
        Spacer(modifier = Modifier.height(12.dp))
        Button(
            elevation = ButtonDefaults.buttonElevation(2.dp),
            onClick = {
                val idLeague = try {
                    viewState.fieldId.toLong()
                } catch (ex: Exception) {
                    1L
                }
                onLoadTopSoccer(idLeague)
            },
            content = {
                Text(
                    text = stringResource(R.string.topsoccer),
                    style = CustomTheme.fonts.header
                )
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = CustomTheme.colors.primary,
                disabledContainerColor = CustomTheme.colors.primary,
                contentColor = CustomTheme.colors.onSurfaceVariant,
                disabledContentColor = CustomTheme.colors.onSurfaceVariant
            )
        )
    }
}