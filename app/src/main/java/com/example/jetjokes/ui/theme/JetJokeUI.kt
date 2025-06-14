package com.example.jetjokes.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetjokes.JokeState

@Composable
fun JetJokeUI(
    state: JokeState,
    modifier: Modifier = Modifier,
    onClick1: () -> Unit,
    onClick2: () -> Unit,
    onClick3: () -> Unit
) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(SoftWhite)
            .clickable { onClick2() }
    ) {
        if (state.isClicked) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .blur(8.dp)
            )
        }

        Card(
            modifier = Modifier
                .padding(32.dp)
                .fillMaxWidth()
                .height(200.dp)
                .align(Alignment.Center)
                .clickable { onClick3() }
                .graphicsLayer {
                    shape = RoundedCornerShape(16.dp)
                    clip = true
                    shadowElevation = if (state.isClicked) 24f else 4f
                },
            colors = CardDefaults.cardColors(containerColor = GhostWhite)
        ) {
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .height(100.dp)
            ) {
                Text(
                    text = state.joke,
                    style = MaterialTheme.typography.bodyLarge,
                    fontFamily = sinetharFont,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .graphicsLayer {
                            alpha = if (state.isClicked) 1f else 0.3f
                        }
                        .blur(if (state.isClicked) 0.dp else 6.dp),
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )

                Text(
                    text = state.author,
                    style = MaterialTheme.typography.bodyLarge,
                    fontFamily = sinetharFont,
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .graphicsLayer {
                            alpha = if (state.isClicked) 1f else 0.3f
                        }
                        .blur(if (state.isClicked) 0.dp else 6.dp),
                    textAlign = TextAlign.Center,
                    color = Color.Black
                )
            }
        }
        FloatingActionButton(
            onClick = onClick1,
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.BottomCenter)
                .offset(y = -210.dp)
                .height(60.dp)
                .width(100.dp),
            shape = RoundedCornerShape(19.dp)
        ) {
            Text(
            text = "Joke",
            fontFamily = sinetharFont,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontSize = 35.sp,
            color = Color(0xFF222222),
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Gray,
                    offset = Offset(2f, 2f),
                    blurRadius = 4f
                )
            )
        )
        }
    }
}

//@Preview(device = "id:pixel_5")
//@Composable
//fun PreviewJetJokeUI() {
//    JetJokeUI(
//        state = JokeState()
//    )
//}