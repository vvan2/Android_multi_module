package org.umc.eatthis_compose.presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.umc.eatthis_compose.R
import org.umc.eatthis_compose.core.designsystem.EatthisTheme

@Preview(showBackground = true)
@Composable
private fun HomeSubCardPreview() {
    EatthisTheme {
        HomeSubCard()
    }
}

@Composable
fun HomeSubCard(
    modifier: Modifier = Modifier,
) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        items(
            count = 10,
            itemContent = {
                HomeSubCardItem()
            }
        )
    }
}

@Composable
fun HomeSubCardItem(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .background(
                color = EatthisTheme.colors.gray300,
                shape = RoundedCornerShape(10.dp),
            )
            .clip(RoundedCornerShape(10.dp))
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_home_banner1),
            contentDescription = null,
            modifier = Modifier
                .padding(10.dp)
        )

    }
}


