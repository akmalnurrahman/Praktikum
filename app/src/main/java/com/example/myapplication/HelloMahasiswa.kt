package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color

class HelloMahasiswa : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Surface(
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Text(
                        text = "Hello Mahasiswa",
                        fontSize = 25.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Color.Green
                    )
                }
                Surface (color = Color.Red,
                modifier = Modifier.fillMaxWidth())
                {
                    Text(
                        text = "Hello Akmal",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,4.dp),
                        color = Color.Cyan
                    )
                }

            }
        }
    }
}
