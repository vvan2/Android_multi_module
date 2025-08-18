package org.umc.eatthis_compose.presentation.map.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import org.umc.eatthis_compose.core.navigation.MainTabRoute
import org.umc.eatthis_compose.presentation.map.MapRoute

fun NavController.navigateMap(
    navOptions: NavOptions?,
) {
    navigate(Map, navOptions)
}

fun NavGraphBuilder.mapNavGraph(
    paddingValues: PaddingValues,
    navigateUp: () -> Unit,
    navigateNext: () -> Unit,
    modifier: Modifier = Modifier,

    ) {
    composable<Map> { backStackEntry ->
        MapRoute(
            paddingValues = paddingValues,
            navigateUp = navigateUp,
            navigateNext = navigateNext,
            modifier = modifier
        )
    }
}

@Serializable
data object Map : MainTabRoute