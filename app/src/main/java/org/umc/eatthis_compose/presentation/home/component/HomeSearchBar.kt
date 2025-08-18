package org.umc.eatthis_compose.presentation.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.umc.eatthis_compose.core.designsystem.EatthisTheme

@Preview(showBackground = true)
@Composable
private fun HomeSearchBarPreview() {
    EatthisTheme {
        HomeSearchBar()
    }
}

@Composable
fun HomeSearchBar(
    modifier: Modifier = Modifier,
    onSearch: (String) -> Unit = {},
    onClear: () -> Unit = {},
    query: String = "",
    placeholder: String = "Search",
) {
    TextField(
        value = query,
        onValueChange = onSearch,
        placeholder = {Text(text = placeholder) },
        modifier = modifier
            .fillMaxWidth()
            .border(1.dp, EatthisTheme.colors.gray200)
            .background(
                color = EatthisTheme.colors.gray50,
                shape = RoundedCornerShape(40.dp)
            )
            .clip(RoundedCornerShape(40.dp)),
        singleLine = true,
        maxLines = 1,
    )
}