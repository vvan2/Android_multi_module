package org.umc.eatthis_compose.presentation.signup.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.umc.eatthis_compose.core.designsystem.EatthisTheme

@Preview(showBackground = true)
@Composable
private fun CheckboxItemPreview() {
    EatthisTheme {
        CheckboxItem(
            content = "이용약관 동의 (필수)",
            isChecked = true,
            onCheckedChange = {}
        )
    }
}

@Composable
fun CheckboxItem(
    content: String,
    modifier: Modifier = Modifier,
    isChecked: Boolean = false,
    onCheckedChange: (Boolean) -> Unit = {},
) {
    Row(
        modifier = modifier
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = content,
            color = EatthisTheme.colors.gray200,
            style = EatthisTheme.typography.body01b15,
        )

        Spacer(modifier = Modifier.weight(1f))

        Checkbox(
            checked = isChecked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            colors = CheckboxDefaults.colors(
                uncheckedColor = EatthisTheme.colors.gray5,
                checkedColor = EatthisTheme.colors.blue250.copy(
                    alpha = 0.5F
                ),
                checkmarkColor = EatthisTheme.colors.gray5.copy(
                    alpha = 0.8F
                ),
                disabledUncheckedColor = EatthisTheme.colors.gray200
            ),
        )
    }
}