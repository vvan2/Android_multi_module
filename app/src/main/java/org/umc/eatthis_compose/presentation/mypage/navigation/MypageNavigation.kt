package org.umc.eatthis_compose.presentation.mypage.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import org.umc.eatthis_compose.core.navigation.MainTabRoute
import org.umc.eatthis_compose.presentation.mypage.MypageRoute

fun NavController.navigateMypage(
    navOptions: NavOptions?,
) {
    navigate(Mypage, navOptions)
}

fun NavGraphBuilder.mypageNavGraph(
    paddingValues: PaddingValues,
    navigateUp: () -> Unit,
    navigateNext: () -> Unit,
    modifier: Modifier = Modifier,

    ) {
    composable<Mypage> { backStackEntry ->
        MypageRoute(
            paddingValues = paddingValues,
            navigateUp = navigateUp,
            navigateNext = navigateNext,
            modifier = modifier
        )
    }
}

@Serializable
data object Mypage : MainTabRoute