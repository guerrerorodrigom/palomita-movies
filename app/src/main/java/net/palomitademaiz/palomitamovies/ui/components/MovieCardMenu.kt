package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.palomitademaiz.palomitamovies.models.CardMenuItem

@Composable
fun CardMenu(
    options: List<CardMenuItem>,
    expandedDefault: Boolean = false
) {
    var expanded by remember { mutableStateOf(expandedDefault) }

    Box {
        CircularIconButton(
            icon = Icons.Default.MoreHoriz,
            contentDescription = "More",
            backgroundColor = Color.Gray.copy(alpha = 0.7f),
            iconColor = Color.White.copy(alpha = 0.8f),
            modifier = Modifier.padding(4.dp),
            onClickAction = { expanded = true }
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.width(160.dp)
        ) {
            options.forEachIndexed { index, value ->
                DropdownMenuItem(
                    onClick = {
                        expanded = false
                        value.onClickAction()
                    }
                ) {
                    Icon(
                        imageVector = value.icon,
                        contentDescription = value.name,
                        modifier = Modifier.padding(end = 16.dp)
                    )
                    Text(text = value.name)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMovieCardMenu() {
    val item = CardMenuItem(name = "Add to list", icon = Icons.Default.List, { })
    val item2 = CardMenuItem(name = "Favorite", icon = Icons.Default.Favorite, { })
    val item3 = CardMenuItem(name = "Watchlist", icon = Icons.Default.Bookmark, { })
    val item4 = CardMenuItem(name = "Your rating", icon = Icons.Default.Star, { })

    CardMenu(options = listOf(item, item2, item3, item4), expandedDefault = true)
}