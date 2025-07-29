package org.umc.eatthis_compose.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.umc.eatthis_compose.core.designsystem.theme.Eatthis_composeTheme
import org.umc.eatthis_compose.core.util.noRippleClickable

@Preview(showBackground = true)
@Composable
private fun EatthisButtonPreview() {
    Eatthis_composeTheme {
        EatthisButton(
            text = "다음",
            isenabled = true,
            onClick = {}
        )
    }
}


@Composable
fun EatthisButton(
    text: String,
    isenabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color =
                    if (isenabled)
                        Eatthis_composeTheme.colors.orange200
                    else
                        Eatthis_composeTheme.colors.gray200,
                shape = RoundedCornerShape(40.dp)
            )
            .clip(RoundedCornerShape(40.dp))
            .padding(horizontal = 16.dp, vertical = 16.dp)
          ,
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            modifier = Modifier
                .noRippleClickable(onClick = onClick),
            color = Eatthis_composeTheme.colors.gray5
        )
    }
}