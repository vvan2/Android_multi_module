package org.umc.eatthis_compose.presentation.mypage

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MypageRoute(
    paddingValues: PaddingValues,
    navigateUp: ()-> Unit,
    navigateNext:()-> Unit,
    modifier: Modifier = Modifier
){
    MypageScreen(
        paddingValues = paddingValues,
        navigateUp = navigateUp,
        navigateNext = navigateNext,
        modifier = modifier
    )
}
@Composable
fun MypageScreen(
    paddingValues: PaddingValues,
    navigateUp: ()-> Unit,
    navigateNext:()-> Unit,
    modifier: Modifier = Modifier
) {

}