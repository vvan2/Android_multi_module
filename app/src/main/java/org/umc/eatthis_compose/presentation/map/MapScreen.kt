package org.umc.eatthis_compose.presentation.map

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MapRoute(
    paddingValues: PaddingValues,
    navigateUp: ()-> Unit,
    navigateNext:()-> Unit,
    modifier: Modifier = Modifier
){
    MapScreen(
        paddingValues = paddingValues,
        navigateUp = navigateUp,
        navigateNext = navigateNext,
        modifier = modifier
    )
}
@Composable
fun MapScreen(
    paddingValues: PaddingValues,
    navigateUp: ()-> Unit,
    navigateNext:()-> Unit,
    modifier: Modifier = Modifier
) {

}