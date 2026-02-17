package com.neac.basesandroid.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.neac.basesandroid.ui.theme.Pink40
import com.neac.basesandroid.ui.theme.Pink80
import com.neac.basesandroid.ui.theme.Purple80
import com.neac.basesandroid.ui.theme.PurpleGrey40

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun MyLazyVerticalGrid() {
    LazyVerticalGrid(
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize().background(PurpleGrey40)
    ) {
        items(50){
            Card(
                modifier = Modifier.fillMaxWidth().height(200.dp),
                colors = CardDefaults.cardColors(containerColor = Pink80)
            ) { }
        }
    }
}