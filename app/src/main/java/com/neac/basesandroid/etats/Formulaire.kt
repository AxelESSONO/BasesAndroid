package com.neac.basesandroid.etats

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.neac.basesandroid.ui.theme.Purple80
import com.neac.basesandroid.ui.theme.PurpleGrey40

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun Formulaire() {

    var text by remember { mutableStateOf("yyyy") }
    var check by remember { mutableStateOf(false) }
    var checkRadio by remember { mutableStateOf(false) }

    val onTextChange = { newText: String ->
        text = newText
    }
    val onCheckChange = { newCheck: Boolean ->
        check = newCheck
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(Purple80)
    ) {
        TextField(
            value = text,
            onValueChange = onTextChange,
        )

        Checkbox(
            checked = check,
            onCheckedChange = onCheckChange,
        )

        Switch(
            checked = check,
            onCheckedChange = onCheckChange
        )

        RadioButton(
            selected = checkRadio,
            onClick = {
                checkRadio = !checkRadio
            }
        )
    }
}