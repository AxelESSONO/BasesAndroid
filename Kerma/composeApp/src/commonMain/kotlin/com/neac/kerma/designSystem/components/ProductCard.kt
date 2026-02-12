package com.neac.kerma.designSystem.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.neac.kerma.designSystem.theme.AppColors
import com.neac.kerma.designSystem.theme.AppDimens
import com.neac.kerma.designSystem.theme.DashCartTheme

@Composable
fun ProductCard(
    title: String = "titre",
    price: String = "300",
    rating: Double = 4.5,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(AppDimens.cardRadius),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Column(
            modifier = Modifier.padding(AppDimens.md)
        ) {
            Box(
                modifier = Modifier
                    .height(140.dp)
                    .fillMaxWidth()
            ) {
                // Image produit (AsyncImage plus tard)
            }

            Spacer(modifier = Modifier.height(AppDimens.sm))

            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall
            )

            Spacer(modifier = Modifier.height(4.dp))

            RatingBar(rating = rating)

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = price,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun ProductCardPreview(){
    DashCartTheme {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(AppDimens.md),
            horizontalArrangement = Arrangement.spacedBy(AppDimens.md),
            verticalArrangement = Arrangement.spacedBy(AppDimens.md),
            modifier = Modifier
                .fillMaxSize()
                .background(AppColors.DarkTextSecondary)
        ){
            items(10){
                ProductCard()
            }
        }
    }
}
