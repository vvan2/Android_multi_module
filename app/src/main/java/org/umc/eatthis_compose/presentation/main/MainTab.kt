package org.umc.eatthis_compose.presentation.main

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import org.umc.eatthis_compose.core.navigation.MainTabRoute
import org.umc.eatthis_compose.R
import org.umc.eatthis_compose.core.navigation.Route
import org.umc.eatthis_compose.presentation.analyze.component.Analyze
import org.umc.eatthis_compose.presentation.home.navigation.Home
import org.umc.eatthis_compose.presentation.map.navigation.Map
import org.umc.eatthis_compose.presentation.mypage.navigation.Mypage

enum class MainTab(
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int,
    @StringRes val contentDesciption: Int,
    val route: MainTabRoute,
) {
    MAP(
        selectedIcon = R.drawable.ic_bottom_map_on,
        unselectedIcon = R.drawable.ic_bottom_map,
        contentDesciption = R.string.content_description_map,
        route = Map
    ),
    HOME(
        selectedIcon = R.drawable.ic_bottom_home_on,
        unselectedIcon = R.drawable.ic_bottom_home,
        contentDesciption = R.string.content_description_home,
        route = Home
    ),
    ANALYZE(
        selectedIcon = R.drawable.ic_bottom_analyze_on,
        unselectedIcon = R.drawable.ic_bottom_analyze,
        contentDesciption = R.string.content_description_analyze,
        route = Analyze
    ),
    MYPAGE(
        selectedIcon = R.drawable.ic_bottom_my_on,
        unselectedIcon = R.drawable.ic_bottom_my,
        contentDesciption = R.string.content_description_mypage,
        route = Mypage
    );

    companion object {
        @Composable
        fun find(predicate:@Composable (MainTabRoute) -> Boolean): MainTab?{
            return entries.find{predicate(it.route)}
        }

        @Composable
        fun contains(predicate:@Composable (Route) -> Boolean): Boolean {
            return entries.any { predicate(it.route) }
        }
    }
}