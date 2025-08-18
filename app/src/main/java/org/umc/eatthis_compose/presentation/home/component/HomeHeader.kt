package org.umc.eatthis_compose.presentation.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.umc.eatthis_compose.R
import org.umc.eatthis_compose.core.designsystem.EatthisTheme

@Preview(showBackground = true)
@Composable
private fun HomeHeaderPreview() {
    EatthisTheme {
        HomeHeader()
    }
}

@Composable
fun HomeHeader(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color.Unspecified)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_home_headlogo),
            contentDescription = null,
            tint = Color.Unspecified
        )
        Spacer(modifier = Modifier.weight(1F))
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_home_headicon),
            contentDescription = null,
            tint = Color.Unspecified
        )

    }
}