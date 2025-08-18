package org.umc.eatthis_compose.presentation.survey.component

import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
private fun previewSurveyHeader() {
    SurveyHeader()
}

@Composable
fun SurveyHeader(
    modifier: Modifier = Modifier,
    title: String = "설문조사",
) {
    LinearProgressIndicator(
        progress = { 0.5f },
        modifier = modifier,
        color = Color.Yellow,
        trackColor = Color.Gray,
        strokeCap = StrokeCap.Round,
        gapSize = 0.dp,
        drawStopIndicator = {}
    )
}