package net.palomitademaiz.palomitamovies.models

import androidx.compose.ui.graphics.vector.ImageVector

data class CardMenuItem(
    val name: String,
    val icon: ImageVector,
    val onClickAction: () -> Unit
)
