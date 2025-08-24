package org.umc.eatthis_compose.presentation.signup.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
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
private fun SignupTopbarPreview() {
    EatthisTheme {
        SignupTopbar()
    }
}
@Composable
fun SignupTopbar (
    modifier : Modifier = Modifier
){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = EatthisTheme.colors.gray5)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_signup_back),
            contentDescription = null,
            tint = Color.Unspecified
        )
    }
}