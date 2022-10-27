package com.example.myapplication

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

class HelloMahasiswa : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            func()
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun func() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {
        Image(painter = painterResource(id = R.drawable.the_batman_movie_2022_hd_wallpaper_1920x1080_74), contentDescription = "Batman" )
        Surface(
            color = Color.Black,
            modifier = Modifier.fillMaxWidth()
        )
        {
            Text(
                text = "I'M BATMAN",
                fontSize = 25.sp,
                modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
        Surface(
            color = Color.Black,
            modifier = Modifier.fillMaxWidth()
        )
        {
            Text(
                text = "Hello Akmal",
                fontSize = 20.sp,
                modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 4.dp),
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }
}
