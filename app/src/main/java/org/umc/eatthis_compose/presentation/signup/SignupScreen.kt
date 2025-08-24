package org.umc.eatthis_compose.presentation.signup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.umc.eatthis_compose.core.component.EatthisButton
import org.umc.eatthis_compose.core.designsystem.EatthisTheme
import org.umc.eatthis_compose.presentation.signup.component.AllCheckbox
import org.umc.eatthis_compose.presentation.signup.component.CheckboxItem
import org.umc.eatthis_compose.presentation.signup.component.SignupTopbar

@Preview(showBackground = true)
@Composable
private fun SignupScreenPreview() {
    EatthisTheme {
        SignupScreen()
    }
}

@Composable
fun SignupScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = EatthisTheme.colors.gray5)
            .padding(vertical = 40.dp)
    ) {
        SignupTopbar()
        SignupTitle()
        AllCheckbox(
            title = "전체동의",
            subtitle = "(선택항목 포함)",
            isChecked = false,
            onCheckedChange = {},
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        CheckboxItem(
            content = "이용약관 동의 (필수)",
            isChecked = false,
            onCheckedChange = {},
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        CheckboxItem(
            content = "만 14세 이상 확인 (필수)",
            isChecked = false,
            onCheckedChange = {},
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        CheckboxItem(
            content = "개인정보 수집 및 이용 동의 (필수)",
            isChecked = false,
            onCheckedChange = {},
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        CheckboxItem(
            content = "AI기반 서비스 이용약간 동의 (필수)",
            isChecked = false,
            onCheckedChange = {},
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        CheckboxItem(
            content = "마케팅 알림 수신 동의 (선택)",
            isChecked = false,
            onCheckedChange = {},
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        CheckboxItem(
            content = "개인정보 수집 및 이용 동의 (선택)",
            isChecked = false,
            onCheckedChange = {},
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )

        EatthisButton(
            text = "다음",
            onClick = {},
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 24.dp),
            isEnabled = false
        )
    }
}

@Composable
private fun SignupTitle(
    modifier: Modifier = Modifier,
) {
    Text(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 24.dp),
        style = EatthisTheme.typography.title03b22,
        text = buildAnnotatedString {
            append("시작하기 위해서는\n")
            withStyle(style = SpanStyle(color = EatthisTheme.colors.blue200)) {
                append("약관동의")
            }
            append("가 필요해요.")

        }
    )

}