package com.neac.kerma.designSystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val AppTypography = Typography(

    displayLarge = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
    ),

    titleLarge = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    ),

    titleMedium = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Medium
    ),

    titleSmall = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    ),

    headlineSmall = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold
    ),

    bodyLarge = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    ),

    bodyMedium = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),

    bodySmall = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    ),

    labelMedium = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium
    ),

    labelSmall = TextStyle(
        fontSize = 11.sp,
        fontWeight = FontWeight.Normal
    )
)
