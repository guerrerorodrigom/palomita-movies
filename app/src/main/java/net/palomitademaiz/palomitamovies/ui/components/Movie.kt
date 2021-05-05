package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.palomitademaiz.palomitamovies.models.Movie

@Composable
fun Movie(movie: Movie, modifier: Modifier = Modifier) {
    Card {
        Column {

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
        posterPath = ""
    )
    Movie(sampleMovie)
}