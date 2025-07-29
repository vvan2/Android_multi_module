package org.umc.eatthis_compose.core.designsystem.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Orange0 = Color(0xFFFFF1E6)
val Orange50 = Color(0XFFFFEAD9)
val Orange100 = Color(0xFFFFD4B0)
val Orange150 = Color(0xFFFF9838)
val Orange175 = Color(0xFFFF852D)
val Orange200 = Color(0xFFFF7300)
val Orange300 = Color(0xFFFF5A00)


val Gray5 = Color(0xFFFCFCFC)
val Gray25 = Color(0xFFF8F8F8)
val Gray50 = Color(0xFFEBEBEB)
val Gray100 = Color(0xFFDCDCDC)
val Gray200 = Color(0xFFBDBDBD)
val Gray300 = Color(0xFF989898)
val Gray400 = Color(0xFF7C7C7C)
val Gray500 = Color(0xFF656565)
val Gray600 = Color(0xFF525252)
val Gray700 = Color(0xFF464646)
val Gray800 = Color(0xFF3D3D3D)
val Gray900 = Color(0xFF292929)
val Gray950 = Color(0xFF161616)


@Stable
data class EatThisColors(
    val orange0: Color = Orange0,
    val orange50: Color = Orange50,
    val orange100: Color = Orange100,
    val orange150: Color = Orange150,
    val orange175: Color = Orange175,
    val orange200: Color = Orange200,
    val orange300: Color = Orange300,

    val gray5: Color = Gray5,
    val gray25: Color = Gray25,
    val gray50: Color = Gray50,
    val gray100: Color = Gray100,
    val gray200: Color = Gray200,
    val gray300: Color = Gray300,
    val gray400: Color = Gray400,
    val gray500: Color = Gray500,
    val gray600: Color = Gray600,
    val gray700: Color = Gray700,
    val gray800: Color = Gray800,
    val gray900: Color = Gray900,
    val gray950: Color = Gray950
)

val defaultEatThisColors = EatThisColors(
    orange0 = Orange0,
    orange50 = Orange50,
    orange100 = Orange100,
    orange150 = Orange150,
    orange175 = Orange175,
    orange200 = Orange200,
    orange300 = Orange300,

    gray5 = Gray5,
    gray25 = Gray25,
    gray50 = Gray50,
    gray100 = Gray100,
    gray200 = Gray200,
    gray300 = Gray300,
    gray400 = Gray400,
    gray500 = Gray500,
    gray600 = Gray600,
    gray700 = Gray700,
    gray800 = Gray800,
    gray900 = Gray900,
    gray950 = Gray950
)

val LocalEatThisColorsProvider = staticCompositionLocalOf { defaultEatThisColors }