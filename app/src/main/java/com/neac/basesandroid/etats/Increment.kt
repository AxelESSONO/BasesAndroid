package com.neac.basesandroid.etats

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.neac.basesandroid.ui.theme.PurpleGrey40

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun Increment(
    onSendCount : (Int) -> Unit = {}
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(
            space = 30.dp,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(PurpleGrey40)
    ) {

        //var count by remember { mutableStateOf(0) }
        var count by rememberSaveable {mutableStateOf(0) }
        Text(
            text = "$count",
            fontSize = 45.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(
                space = 30.dp,
                alignment = Alignment.CenterHorizontally
            ),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        )
        {

            Button(
                onClick = {
                    count--
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "Decrement",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                )
            }

            Button(
                onClick = {
                    count++
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "Increment",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                )
            }
        }

        Button(
            onClick = {
                onSendCount(count)
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Send count value",
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold,
            )
        }
    }
}