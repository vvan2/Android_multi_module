package org.umc.eatthis_compose.presentation.analyze

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AnalyzeRoute(
    paddingValues: PaddingValues,
    navigateUp: ()-> Unit,
    navigateNext:()-> Unit,
    modifier: Modifier = Modifier
){
    AnalyzeScreen(
        paddingValues = paddingValues,
        navigateUp = navigateUp,
        navigateNext = navigateNext,
        modifier = modifier
    )
}
@Composable
fun AnalyzeScreen(
    paddingValues: PaddingValues,
    navigateUp: ()-> Unit,
    navigateNext:()-> Unit,
    modifier: Modifier = Modifier
) {

}