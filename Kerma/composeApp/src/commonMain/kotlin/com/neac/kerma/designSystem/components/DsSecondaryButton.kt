package com.neac.kerma.designSystem.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.neac.kerma.designSystem.theme.AppDimens
import com.neac.kerma.designSystem.theme.DashCartTheme

@Composable
fun DsSecondaryButton(
    text: String = "Axel",
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(AppDimens.buttonHeight),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondary
        ),
        onClick = onClick
    ) {
        Text(text = text)
    }
}

@Preview
@Composable
private fun DsSecondaryButtonPreview(){
    DashCartTheme {
        DsSecondaryButton()
    }
}
