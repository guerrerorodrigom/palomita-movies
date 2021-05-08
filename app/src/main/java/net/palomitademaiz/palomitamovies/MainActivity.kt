package net.palomitademaiz.palomitamovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import net.palomitademaiz.palomitamovies.models.Filter
import net.palomitademaiz.palomitamovies.models.Movie
import net.palomitademaiz.palomitamovies.ui.components.MovieCarousel
import net.palomitademaiz.palomitamovies.ui.theme.PalomitaMoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PalomitaMoviesTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val sampleMovie = Movie(
                        id = 12345,
                        title = "Raya and the Last Dragon",
                        originalTitle = "Raya and the Last Dragon",
                        posterPath = "https://www.themoviedb.org/t/p/w440_and_h660_face/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg",
                        releaseDate = "Mar 03, 2021",
                        score = 0.83f
                    )

                    val selectedFilter = Filter("Streaming")
                    val filter = Filter("On TV")
                    val filterTwo = Filter("In Theaters")

                    val filters = listOf(filter, selectedFilter, filterTwo)

                    val movies =
                        listOf(sampleMovie, sampleMovie, sampleMovie, sampleMovie, sampleMovie)
                    MovieCarousel(
                        filters = filters,
                        selectedFilter = selectedFilter,
                        carouselTitle = "Popular",
                        movies = movies,
                        carouselRightText = "More"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PalomitaMoviesTheme {
        Surface(color = MaterialTheme.colors.background) {
            val sampleMovie = Movie(
                id = 12345,
                title = "Raya and the Last Dragon",
                originalTitle = "Raya and the Last Dragon",
                posterPath = "https://www.themoviedb.org/t/p/w440_and_h660_face/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg",
                releaseDate = "Mar 03, 2021",
                score = 0.83f
            )

            val selectedFilter = Filter("Streaming")
            val filter = Filter("On TV")
            val filterTwo = Filter("In Theaters")

            val filters = listOf(filter, selectedFilter, filterTwo)

            val movies = listOf(sampleMovie, sampleMovie, sampleMovie, sampleMovie, sampleMovie)
            MovieCarousel(
                carouselTitle = "Popular",
                movies = movies,
                carouselRightText = "More",
                selectedFilter = selectedFilter,
                filters = filters
            )
        }
    }
}