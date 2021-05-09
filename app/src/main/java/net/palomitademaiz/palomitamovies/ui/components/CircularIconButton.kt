package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreHoriz
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CircularIconButton(
    icon: ImageVector,
    contentDescription: String,
    backgroundColor: Color,
    iconColor: Color,
    modifier: Modifier = Modifier,
    onClickAction: () -> Unit
) {
    Box(
        modifier
            .size(20.dp)
            .clip(shape = RoundedCornerShape(50))
            .background(color = backgroundColor)
    ) {
        IconButton(
            onClick = { onClickAction() },
        ) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                tint = iconColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCircularIconButton() {
    CircularIconButton(
        Icons.Rounded.MoreHoriz,
        "More",
        Color.Gray.copy(alpha = 0.5f),
        Color.White.copy(alpha = 1.0f),
        onClickAction = {}
    )
}