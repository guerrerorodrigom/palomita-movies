package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import net.palomitademaiz.palomitamovies.models.Movie

@Composable
fun Movie(movie: Movie, modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .size(width = 124.dp, height = 292.dp),
        elevation = 8.dp
    ) {
        Column {
            ConstraintLayout {
                val (image, score) = createRefs()
                RemoteImage(
                    url = movie.posterPath,
                    contentDescription = movie.title,
                    modifier = Modifier.constrainAs(image) {
                        centerHorizontallyTo(parent)
                        top.linkTo(parent.top)
                    })
                Score(
                    score = movie.score,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .constrainAs(score) {
                            start.linkTo(image.start)
                            centerAround(image.bottom)
                        })

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
    Movie(sampleMovie)
}