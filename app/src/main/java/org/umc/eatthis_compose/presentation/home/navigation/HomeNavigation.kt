package org.umc.eatthis_compose.presentation.home.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import org.umc.eatthis_compose.core.navigation.MainTabRoute
import org.umc.eatthis_compose.presentation.home.HomeRoute


fun NavController.navigateHome(
    navOptions: NavOptions?,
) {
    navigate(Home, navOptions)
}

fun NavGraphBuilder.homeNavGraph(
    paddingValues: PaddingValues,
    navigateUp: () -> Unit,
    navigateNext: () -> Unit,
    modifier: Modifier = Modifier,

    ) {
    composable<Home> { backStackEntry ->
        HomeRoute(
            paddingValues = paddingValues,
            navigateUp = navigateUp,
            navigateNext = navigateNext,
            modifier = modifier
        )
    }
}

@Serializable
data object Home : MainTabRoute