package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.palomitademaiz.palomitamovies.ui.theme.*

@Composable
fun Score(
    score: Float,
    modifier: Modifier = Modifier
) {
    val color = when {
        score == 0f -> NoRating
        score > 0 && score < 0.50 -> RatingBad
        score >= 0.50 && score < 0.70 -> RatingMedium
        else -> RatingGood
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .wrapContentSize(Alignment.Center)
            .clip(CircleShape)
            .background(RatingBackground)
    ) {

        Text(
            text = "${getPercentage(score)}%",
            fontWeight = FontWeight.Bold,
            fontSize = 8.sp,
            color = RatingText
        )

        CircularProgressIndicator(
            progress = score,
            modifier = Modifier.size(32.dp),
            color = color
        )
    }
}

private fun getPercentage(score: Float) = (score * 100).toInt()

@Preview(showBackground = true)
@Composable
fun GoodScorePreview() {
    Score(0.85f)
}

@Preview(showBackground = true)
@Composable
fun MediumScorePreview() {
    Score(0.55f)
}

@Preview(showBackground = true)
@Composable
fun BadScorePreview() {
    Score(0.35f)
}

@Preview(showBackground = true)
@Composable
fun NoScorePreview() {
    Score(0f)
}