package com.example.jetjokes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.jetjokes.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val fontProvider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val poppins = FontFamily(
    Font(
        googleFont = GoogleFont("Poppins"),
        fontProvider = fontProvider,
        weight = FontWeight.Normal
    )
)

val pacificoFontFamily = FontFamily(
    Font(GoogleFont("Pacifico"), fontProvider, FontWeight.Normal)
)

val dancingScriptFont = FontFamily(
    Font(GoogleFont("Dancing Script"), fontProvider, FontWeight.Bold)
)

val lobsterFontFamily = FontFamily(
    Font(GoogleFont("Lobster"), fontProvider, FontWeight.Normal)
)

val sinetharFont = FontFamily(
    androidx.compose.ui.text.font.Font(R.font.sinethar)
)