package com.example.myapplication
import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Tugas : ComponentActivity(){
    override fun onCreate(SavedInstanceState: Bundle?){
        super.onCreate(SavedInstanceState)
        setContent{
            avenger()
        }
    }
}
fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}

fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun avenger() {
    val surfaceWidth = getScreenWidth() * 0.12681;
    val surfaceHeight = getScreenHeight() * 0.1905;
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                color = Color(0xff004170),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.captain),
                        contentDescription = "Captain Logo",
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Captain America",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xfffffff),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hawkeye),
                        contentDescription = "hawkeye Logo",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "Hawkeye",
                        fontSize = 16.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )

                }
            }
            Surface(
                color = Color(0xFF70964B),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hulk),
                        contentDescription = "Hulk Logo",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.padding(12.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Hulk",
                        fontSize = 16.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Center
                    )

                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = Color(0xFFAA0505),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ironman),
                        contentDescription = "Ironman Logo",
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Ironman",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )

                }
            }
            Surface(
                color = Color(0xFF404B56),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.thor),
                        contentDescription = "Thor Logo",
                        contentScale = ContentScale.Crop,
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                            .clip(CircleShape)
                    )
                    Text(
                        text = "Thor",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )

                }
            }
            Surface(
                color = Color(0xFF000000),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.widow),
                        contentDescription = "Black Widow Logo",
                        alignment = Alignment.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                    Text(
                        text = "Black widow",
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )

                }
            }
        }
    }
}
