package org.umc.eatthis_compose.presentation.main

// MainNavHost.kt 파일 상단에 추가
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import org.umc.eatthis_compose.presentation.analyze.component.analyzeNavGraph
import org.umc.eatthis_compose.presentation.home.navigation.homeNavGraph
import org.umc.eatthis_compose.presentation.map.navigation.mapNavGraph
import org.umc.eatthis_compose.presentation.mypage.navigation.mypageNavGraph

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
@Composable
fun MainNavHost(
    navigator: MainNavigator,
    paddingValues: PaddingValues,
    snackbarHostState: SnackbarHostState,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navigator.navController,
        startDestination = navigator.startDestination,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None },
    ) {
        homeNavGraph(
            paddingValues = paddingValues,
            navigateUp = navigator::navigateUp,
            navigateNext = navigator::navigateDummyNext,
            modifier = modifier
        )
        mypageNavGraph(
            paddingValues = paddingValues,
            navigateUp = navigator::navigateUp,
            navigateNext = navigator::navigateDummyNext,
            modifier = modifier
        )
        mapNavGraph(
            paddingValues = paddingValues,
            navigateUp = navigator::navigateUp,
            navigateNext = navigator::navigateDummyNext,
            modifier = modifier
        )
        analyzeNavGraph(
            paddingValues = paddingValues,
            navigateUp = navigator::navigateUp,
            navigateNext = navigator::navigateDummyNext,
            modifier = modifier
        )
    }
}