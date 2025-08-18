package org.umc.eatthis_compose.core.designsystem

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat


private val LocalEatthisColors = staticCompositionLocalOf<EatThisColors> {
    error("No AlarmiColors provided")
}

private val LocalEatthisTypography = staticCompositionLocalOf<EatthisTypography> {
    error("No AlarmiTypography provided")
}


object EatthisTheme {
    val colors: EatThisColors
        @Composable
        @ReadOnlyComposable
        get() = LocalEatthisColors.current

    val typography: EatthisTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalEatthisTypography.current
}

// Provider -> Provide
@Composable
fun ProvideAlarmiColorsAndTypography(
    colors: EatThisColors,
    typography: EatthisTypography,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalEatthisColors provides colors,
        LocalEatthisTypography provides typography,
        content = content
    )
}

// 여기있던 중복함수 제거함

@Composable
fun EatthisTheme(
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.run {
                WindowCompat.getInsetsController(this, view).isAppearanceLightStatusBars = false
            }
        }
    }

    ProvideAlarmiColorsAndTypography(
        colors = defaultEatThisColors,
        typography = defaultEatthisTypography
    ) {
        MaterialTheme(
            content = content
        )
    }
}