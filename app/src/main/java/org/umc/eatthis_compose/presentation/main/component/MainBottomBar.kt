package org.umc.eatthis_compose.presentation.main.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.umc.eatthis_compose.R
import org.umc.eatthis_compose.core.designsystem.EatthisTheme
import org.umc.eatthis_compose.core.util.noRippleClickable

@Preview(showBackground = true)
@Composable
private fun PreviewMainBottomBar() {
    EatthisTheme {
        MainBottomBar(
        )
    }
}

@Composable
fun MainBottomBar(
    modifier: Modifier = Modifier,

    ) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = EatthisTheme.colors.gray5
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 28.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomSelectCard(
                title = "지도",
                icon = ImageVector.vectorResource(id = R.drawable.ic_bottom_map)
            )
            BottomSelectCard(
                title = "홈",
                icon = ImageVector.vectorResource(id = R.drawable.ic_bottom_home)
            )
            CenterCamera()
            BottomSelectCard(
                title = "분석",
                icon = ImageVector.vectorResource(id = R.drawable.ic_bottom_analyze)
            )
            BottomSelectCard(
                title = "마이",
                icon = ImageVector.vectorResource(id = R.drawable.ic_bottom_my)
            )
        }
    }
}

@Composable
fun BottomSelectCard(
    title: String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .noRippleClickable { },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.Unspecified
        )
        Text(
            text = title,
            style = EatthisTheme.typography.caption03r10,
            color = EatthisTheme.colors.gray200

        )
    }
}

@Composable
fun CenterCamera(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .height(48.dp)
            .width(48.dp)
            .noRippleClickable {  }
            .background(
                color = EatthisTheme.colors.blue200,
                shape = CircleShape
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)

    ){
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_bottom_camera),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier
                .align(Alignment.Center)
        )

    }

}