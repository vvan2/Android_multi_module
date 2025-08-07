package org.umc.eatthis_compose.presentation.analyze.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import org.umc.eatthis_compose.core.navigation.MainTabRoute
import org.umc.eatthis_compose.presentation.analyze.AnalyzeRoute
import org.umc.eatthis_compose.presentation.home.HomeRoute

fun NavController.navigateAnalyze(
    navOptions: NavOptions?,
) {
    navigate(Analyze, navOptions)
}

fun NavGraphBuilder.analyzeNavGraph(
    paddingValues: PaddingValues,
    navigateUp: () -> Unit,
    navigateNext: () -> Unit,
    modifier: Modifier = Modifier,

    ) {
    composable<Analyze> { backStackEntry ->
        AnalyzeRoute(
            paddingValues = paddingValues,
            navigateUp = navigateUp,
            navigateNext = navigateNext,
            modifier = modifier
        )
    }
}

@Serializable
data object Analyze : MainTabRoute