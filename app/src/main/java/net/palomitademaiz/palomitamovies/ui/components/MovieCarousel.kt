package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.palomitademaiz.palomitamovies.models.Movie

@Composable
fun MovieCarousel(
    carouselTitle: String,
    movies: List<Movie>,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = carouselTitle,
            style = MaterialTheme.typography.subtitle1
        )
        LazyRow(modifier = Modifier.padding(end = 16.dp)) {
            items(movies) { movie ->
                Movie(movie, Modifier.padding(start = 16.dp, bottom = 16.dp))
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
    MovieCarousel(carouselTitle = "Popular", movies = movies)
}