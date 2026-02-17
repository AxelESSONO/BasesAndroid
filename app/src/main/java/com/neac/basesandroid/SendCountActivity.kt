package com.neac.basesandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.neac.basesandroid.etats.Increment
import com.neac.basesandroid.ui.theme.BasesAndroidTheme

class SendCountActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasesAndroidTheme {
                Increment(
                    onSendCount = { newCount ->
                        val intent = Intent(this,
                            ReceivedActivity::class.java)
                        intent.putExtra("count", newCount)
                        startActivity(intent)
                    }
                )
            }
        }
    }
}