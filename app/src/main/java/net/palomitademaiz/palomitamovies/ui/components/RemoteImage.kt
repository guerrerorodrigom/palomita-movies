package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.accompanist.coil.rememberCoilPainter
import com.google.accompanist.imageloading.ImageLoadState
import net.palomitademaiz.palomitamovies.R

@Composable
fun RemoteImage(
    url: String,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,
    placeholderColor: Color? = MaterialTheme.colors.onSurface.copy(alpha = 0.2f),
    width: Dp? = null,
    height: Dp? = null
) {
    Box(modifier) {
        val painter = rememberCoilPainter(
            request = url,
            previewPlaceholder = R.drawable.movie_image_preview
        )

        val imageModifier = if (width != null && height != null) {
            Modifier.size(width, height)
        } else {
            Modifier
        }
        Image(
            painter = painter,
            contentDescription = contentDescription,
            contentScale = contentScale,
            modifier = imageModifier
        )

        if (painter.loadState is ImageLoadState.Loading && placeholderColor != null) {
            Spacer(
                modifier = Modifier
                    .matchParentSize()
                    .background(placeholderColor)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRemoteImage() {
    RemoteImage(
        url = "http://www.palomitademaiz.net/",
        contentDescription = "Test image",
    )
}