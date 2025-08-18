package org.umc.eatthis_compose.presentation.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun HomeRoute(
    paddingValues: PaddingValues,
    navigateUp: ()-> Unit,
    navigateNext:()-> Unit,
    modifier: Modifier = Modifier
){
    HomeScreen(
        paddingValues = paddingValues,
        navigateUp = navigateUp,
        navigateNext = navigateNext,
        modifier = modifier
    )
}
@Composable
fun HomeScreen(
    paddingValues: PaddingValues,
    navigateUp: ()-> Unit,
    navigateNext:()-> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn (

    ){  }

}