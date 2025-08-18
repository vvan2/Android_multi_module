package org.umc.eatthis_compose.presentation.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import org.umc.eatthis_compose.presentation.analyze.component.navigateAnalyze
import org.umc.eatthis_compose.presentation.home.navigation.Home
import org.umc.eatthis_compose.presentation.home.navigation.navigateHome
import org.umc.eatthis_compose.presentation.main.dummy.navigateDummyNext
import org.umc.eatthis_compose.presentation.map.navigation.navigateMap
import org.umc.eatthis_compose.presentation.mypage.navigation.navigateMypage

class MainNavigator(
    val navController: NavHostController,
) {
    private val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val startDestination = Home

    val currentTab: MainTab?
        @Composable get() = MainTab.find { tab ->
            currentDestination?.hasRoute(tab::class) == true
        }

    var isRecordVisible: Boolean = false
        private set

    fun navigate(tab: MainTab) {
        val navOptions = androidx.navigation.navOptions {
            navController.currentDestination?.route?.let {
                popUpTo(it) {
                    inclusive = true
                    saveState = true
                }
            }
            launchSingleTop = true
            restoreState = true
        }
        when (tab) {
            MainTab.HOME -> navController.navigateHome(navOptions)
            MainTab.MAP -> navController.navigateMap(navOptions)
            MainTab.ANALYZE -> navController.navigateAnalyze(navOptions)
            MainTab.MYPAGE -> navController.navigateMypage(navOptions)
        }

    }

    fun setOnVisibleRecord(visible: Boolean) {
        isRecordVisible = visible
    }

    fun navigateHome(navOptions: NavOptions? = null) {
        navController.navigateHome(navOptions)
    }

    fun navigateMap(navOptions: NavOptions? = null) {
        navController.navigateMap(navOptions)
    }

    fun navigateAnalyze(navOptions: NavOptions? = null) {
        navController.navigateAnalyze(navOptions)
    }

    fun navigateMyPage(navOptions: NavOptions? = null) {
        navController.navigateMypage(navOptions)
    }

    fun navigateUp() {
        navController.navigateUp()
    }
    fun navigateDummyNext(navOptions: NavOptions? = null) {
        navController.navigateDummyNext(navOptions = navOptions)
    }

}

@Composable
fun rememberMainNavigator(
    navController: NavHostController = rememberNavController(),
): MainNavigator = remember(navController) {
    MainNavigator(navController)
}
