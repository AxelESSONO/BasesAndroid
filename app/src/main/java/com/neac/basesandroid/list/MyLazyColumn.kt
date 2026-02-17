package com.neac.basesandroid.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.neac.basesandroid.ui.theme.Pink40
import com.neac.basesandroid.ui.theme.Pink80
import com.neac.basesandroid.ui.theme.PurpleGrey40

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun MyLazyColumn() {
    LazyColumn(
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement
            .spacedBy(10.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40)
    ) {
        items(30){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Pink80
                )
            ) { }
        }
    }
}