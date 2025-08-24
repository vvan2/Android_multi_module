package org.umc.eatthis_compose.core.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.umc.eatthis_compose.core.designsystem.EatthisTheme

@Preview(showBackground = true)
@Composable
private fun PreviewEatthisButton() {
    EatthisTheme {
        EatthisButton(
            text = "버튼",
            onClick = {}
        )
    }
}

@Composable
fun EatthisButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(40.dp))
            .background(
                color = if (isEnabled) EatthisTheme.colors.blue250 else EatthisTheme.colors.gray200,
            )
            .clickable { onClick() }
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = text,
            style = EatthisTheme.typography.body01b15,
            color = EatthisTheme.colors.gray5
        )
    }
}