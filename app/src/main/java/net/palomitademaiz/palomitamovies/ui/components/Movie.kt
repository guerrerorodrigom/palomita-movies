package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.palomitademaiz.palomitamovies.models.CardMenuItem
import net.palomitademaiz.palomitamovies.models.Movie

@Composable
fun Movie(
    movie: Movie,
    movieCardMenuList: List<CardMenuItem>,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .size(width = 124.dp, height = 292.dp),
        elevation = 8.dp
    ) {
        Column {
            Box {
                Column {
                    RemoteImage(
                        url = movie.posterPath,
                        contentDescription = movie.title
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(16.dp)
                    )
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.weight(1f))
                    CardMenu(options = movieCardMenuList)
                }
                Score(
                    score = movie.score,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .align(Alignment.BottomStart)
                )
            }
            Text(
                text = movie.title,
                style = MaterialTheme.typography.subtitle2,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(all = 8.dp)
            )
            Text(
                text = movie.releaseDate,
                style = MaterialTheme.typography.caption,
                modifier = Modifier.padding(bottom = 8.dp, start = 8.dp, end = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MoviePreview() {
    val sampleMovie = Movie(
        id = 12345,
        title = "Raya and the Last Dragon",
        originalTitle = "Raya and the Last Dragon",
        posterPath = "",
        releaseDate = "Mar 03, 2021",
        score = 0.83f
    )
    val item = CardMenuItem(name = "Add to list", icon = Icons.Default.List, { })
    val item2 = CardMenuItem(name = "Favorite", icon = Icons.Default.Favorite, { })
    val item3 = CardMenuItem(name = "Watchlist", icon = Icons.Default.Bookmark, { })
    val item4 = CardMenuItem(name = "Your rating", icon = Icons.Default.Star, { })

    Movie(sampleMovie, listOf(item, item2, item3, item4))
}