package org.umc.eatthis_compose.core.designsystem

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import org.umc.eatthis_compose.R

val PretendardBold = FontFamily(Font(R.font.pretendard_bold, FontWeight.Bold))
val PretendardSemiBold = FontFamily(Font(R.font.pretendard_semibold, FontWeight.SemiBold))
val PretendardMedium = FontFamily(Font(R.font.pretendard_medium, FontWeight.Medium))
val PretendardRegular = FontFamily(Font(R.font.pretendard_regular, FontWeight.Normal))

@Immutable
data class EatthisTypography(
    // Title
    val title01b88: TextStyle,
    val title02b30: TextStyle,
    val title03b22: TextStyle,
    val title04b18: TextStyle,
    val title05b13: TextStyle,

    // Body
    val body01b15: TextStyle,
    val body02b12: TextStyle,
    val body03sb12: TextStyle,
    val body04m13: TextStyle,
    val body05r15: TextStyle,
    val body06r14: TextStyle,

    // Caption
    val caption01r13: TextStyle,
    val caption02r11: TextStyle,
    val caption03r10: TextStyle

)

private fun EatthisTextStyle(
    fontFamily: FontFamily,
    fontSize: TextUnit,
    lineHeight: TextUnit,
    letterSpacing: TextUnit
): TextStyle = TextStyle(
    fontFamily = fontFamily,
    fontSize = fontSize,
    lineHeight = lineHeight,
    letterSpacing = letterSpacing,
    lineHeightStyle = LineHeightStyle(
        alignment = LineHeightStyle.Alignment.Center,
        trim = LineHeightStyle.Trim.None
    )
)

val defaultEatthisTypography = EatthisTypography(
    title01b88 = EatthisTextStyle(
        fontFamily = PretendardBold,
        fontSize = 88.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    title02b30 = EatthisTextStyle(
        fontFamily = PretendardBold,
        fontSize = 30.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    title03b22 = EatthisTextStyle(
        fontFamily = PretendardBold,
        fontSize = 22.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    title04b18 = EatthisTextStyle(
        fontFamily = PretendardBold,
        fontSize = 18.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    title05b13 = EatthisTextStyle(
        fontFamily = PretendardBold,
        fontSize = 13.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),

    body01b15 = EatthisTextStyle(
        fontFamily = PretendardBold,
        fontSize = 15.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    body02b12 = EatthisTextStyle(
        fontFamily = PretendardBold,
        fontSize = 12.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    body03sb12 = EatthisTextStyle(
        fontFamily = PretendardSemiBold,
        fontSize = 12.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    body04m13 = EatthisTextStyle(
        fontFamily = PretendardMedium,
        fontSize = 13.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    body05r15 = EatthisTextStyle(
        fontFamily = PretendardRegular,
        fontSize = 15.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    body06r14 = EatthisTextStyle(
        fontFamily = PretendardRegular,
        fontSize = 14.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),

    caption01r13 = EatthisTextStyle(
        fontFamily = PretendardRegular,
        fontSize = 13.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    caption02r11 = EatthisTextStyle(
        fontFamily = PretendardRegular,
        fontSize = 11.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    ),
    caption03r10 = EatthisTextStyle(
        fontFamily = PretendardRegular,
        fontSize = 10.sp,
        lineHeight = 1.45.em,
        letterSpacing = (-0.02).em
    )
)