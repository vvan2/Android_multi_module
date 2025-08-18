package org.umc.eatthis_compose.core.designsystem

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Blue0 = Color(0xFFE8EFFD)
val Blue50 = Color(0xFFDDE7FC)
val Blue100 = Color(0xFFB9CDFa)
val Blue150 = Color(0xFF1C5EEE)
val Blue200 = Color(0xFF1955D6)
val Blue250 = Color(0xFF164BBE)
val Blue300 = Color(0xFF1547B3)
val Blue350 = Color(0xFF11388F)
val Blue400 = Color(0xFF0D2A6B)
val Blue450 = Color(0xFF0A2153)


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


@Immutable
data class EatThisColors(
    val blue0: Color = Blue0,
    val blue50: Color = Blue50,
    val blue100: Color = Blue100,
    val blue150: Color = Blue150,
    val blue200: Color = Blue200,
    val blue250: Color = Blue250,
    val blue300: Color = Blue300,
    val blue350: Color = Blue350,
    val blue400: Color = Blue400,
    val blue450: Color = Blue450,

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
    blue0 = Blue0,
    blue50 = Blue50,
    blue100 = Blue100,
    blue150 = Blue150,
    blue200 = Blue200,
    blue250 = Blue250,
    blue300 = Blue300,
    blue350 = Blue350,
    blue400 = Blue400,
    blue450 = Blue450,

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