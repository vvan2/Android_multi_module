package org.umc.eatthis_compose.core.designsystem.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

object Eatthis_composeTheme {
    val colors: EatThisColors
        @Composable
        @ReadOnlyComposable
        get() = LocalEatThisColorsProvider.current

}

@Composable
fun ProvideEatThisColors(
    colors: EatThisColors,
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalEatThisColorsProvider provides colors,
        content = content
    )
}


@Composable
fun Eatthis_composeTheme(
    content: @Composable () -> Unit,
) {
    ProvideEatThisColors(
        colors = defaultEatThisColors,
    ) {
        val view = LocalView.current
        if (!view.isInEditMode) {
            SideEffect {
                (view.context as Activity).window.run {
                    WindowCompat.getInsetsController(this, view).isAppearanceLightStatusBars = false
                }
            }
        }
        MaterialTheme(
            content = content
        )
    }
}