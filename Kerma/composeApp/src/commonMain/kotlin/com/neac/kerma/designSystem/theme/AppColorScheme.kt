package com.neac.kerma.designSystem.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

val LightColorScheme = lightColorScheme(
    primary = AppColors.OrangePrimary,
    secondary = AppColors.BlueSecondary,
    background = AppColors.LightBackground,
    surface = AppColors.LightSurface,
    onPrimary = AppColors.LightBackground,
    onBackground = AppColors.LightTextPrimary,
    onSurface = AppColors.LightTextPrimary,
    error = AppColors.Error
)

val DarkColorScheme = darkColorScheme(
    primary = AppColors.OrangePrimary,
    secondary = AppColors.BlueSecondary,
    background = AppColors.DarkBackground,
    surface = AppColors.DarkSurface,
    onPrimary = AppColors.DarkTextPrimary,
    onBackground = AppColors.DarkTextPrimary,
    onSurface = AppColors.DarkTextPrimary,
    error = AppColors.Error
)
