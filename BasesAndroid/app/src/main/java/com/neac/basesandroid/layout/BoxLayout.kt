package com.neac.basesandroid.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.neac.basesandroid.ui.theme.PurpleGrey40

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun BoxLayout(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40)
    ) {
        // Box 1
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Red)
                .align(Alignment.Center)
        )

        // Box 2
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Blue)
                .align(Alignment.CenterStart))

        // Box 3
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Magenta)
                .align(Alignment.CenterEnd))

        // Box 4
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Green)
                .align(Alignment.TopCenter))

        // Box 5
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Cyan)
                .align(Alignment.TopEnd)
        )

        // Box 6
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Black)
                .align(Alignment.TopStart)
        )

        // Box 7
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.White)
                .align(Alignment.BottomCenter)
        )

        // Box 8
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Yellow)
                .align(Alignment.BottomStart)
        )

        // Box 9
        Box(
            modifier = Modifier
                .fillMaxSize(fraction = 0.3f)
                .background(Color.Gray)
                .align(Alignment.BottomEnd)
        )
    }
}