package org.umc.eatthis_compose.presentation.signup.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.umc.eatthis_compose.core.designsystem.EatthisTheme

@Preview(showBackground = true)
@Composable
private fun AllCheckboxPreview() {
    EatthisTheme {
        AllCheckbox(
            title = "전체동의",
            subtitle = "(선택항목 포함)",
            isChecked = true,
            onCheckedChange = {}
        )
    }
}

@Composable
fun AllCheckbox(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier,
    isChecked: Boolean = false,
    onCheckedChange: (Boolean) -> Unit = {},
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = EatthisTheme.colors.gray100,
                shape = RoundedCornerShape(40.dp)
            )
            .clip(RoundedCornerShape(40.dp))
            .padding(horizontal = 16.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = title,
            color = EatthisTheme.colors.blue250,
            style = EatthisTheme.typography.body01b15
        )
        Text(
            text = subtitle,
            color = EatthisTheme.colors.gray700,
            style = EatthisTheme.typography.caption01r13
        )

        Spacer(modifier = Modifier.weight(1f))

        Checkbox(
            checked = isChecked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            colors = CheckboxDefaults.colors(
                uncheckedColor = EatthisTheme.colors.gray5,
                checkedColor = EatthisTheme.colors.blue250,
                checkmarkColor = EatthisTheme.colors.gray5
            ),
        )
    }
}