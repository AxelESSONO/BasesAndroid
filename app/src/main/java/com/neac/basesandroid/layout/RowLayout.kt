package com.neac.basesandroid.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.neac.basesandroid.ui.theme.PurpleGrey40

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowLayout() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40)
    ) {

        Text(
            "A",
            fontSize = 58.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text(
            "B",
            fontSize = 58.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text(
            "C",
            fontSize = 58.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
    }
}