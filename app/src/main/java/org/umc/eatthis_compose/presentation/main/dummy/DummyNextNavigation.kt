package org.umc.eatthis_compose.presentation.main.dummy

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import org.umc.eatthis_compose.core.navigation.Route

fun NavController.navigateDummyNext(
    navOptions: NavOptions?
) {
    navigate(DummyNext, navOptions)
}

fun NavGraphBuilder.dummyNextNavGraph(
    paddingValues: PaddingValues,
) {
    composable<DummyNext> {
        DummyNextRoute(
            paddingValues = paddingValues,
        )
    }
}

@Serializable
data object DummyNext : Route