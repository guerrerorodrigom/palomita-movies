package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.palomitademaiz.palomitamovies.models.Movie

@Composable
fun MovieCarousel(
    carouselTitle: String,
    carouselRightText: String,
    movies: List<Movie>,
    modifier: Modifier = Modifier
) {
    Column(modifier.padding(bottom = 16.dp)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                modifier = Modifier.padding(16.dp),
                text = carouselTitle.toUpperCase(),
                style = MaterialTheme.typography.subtitle1
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                modifier = Modifier.padding(16.dp),
                text = carouselRightText.toUpperCase(),
                style = MaterialTheme.typography.subtitle1,
            )
        }

        LazyRow {
            itemsIndexed(movies) { index, movie ->

                val movieModifier = if (index == movies.size - 1) {
                    Modifier.padding(start = 16.dp, end = 16.dp)
                } else {
                    Modifier.padding(start = 16.dp)
                }
                Movie(movie, movieModifier)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMovieCarousel() {
    val sampleMovie = Movie(
        id = 12345,
        title = "Raya and the Last Dragon",
        originalTitle = "Raya and the Last Dragon",
        posterPath = "",
        releaseDate = "Mar 03, 2021",
        score = 0.83f
    )

    val movies = listOf(sampleMovie, sampleMovie, sampleMovie, sampleMovie, sampleMovie)
    MovieCarousel(carouselTitle = "Popular", movies = movies, carouselRightText = "More")
}