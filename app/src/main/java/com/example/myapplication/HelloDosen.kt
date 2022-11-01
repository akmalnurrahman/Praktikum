package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class HelloDosen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.imbatman),
                description = stringResource(R.string.dark),
                backgroundColor = Color(0xFFAA0505),
                image =  R.drawable.ironman,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.imbatman),
                description = stringResource(R.string.dark),
                backgroundColor = Color(0xff004170),
                image = R.drawable.captain,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.imbatman),
                description = stringResource(R.string.dark),
                backgroundColor = Color(0xFF70964B),
                image = R.drawable.hulk,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.imbatman),
                description = stringResource(R.string.dark),
                backgroundColor = Color(0xfff7521b) ,
                image = R.drawable.hawkeye,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.imbatman),
                description = stringResource(R.string.dark),
                backgroundColor = Color(0xFF404B56),
                image = R.drawable.thor,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.imbatman),
                description = stringResource(R.string.dark),
                backgroundColor = Color(0xFF000000),
                image = R.drawable.widow,
                modifier = Modifier.weight(1f)
            )
        }

    }
}

// weight issue : https://stackoverflow.com/questions/64751198/column-weight-distribution-in-compose

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    image: Int,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = image),
            contentDescription = "luffy",
            modifier = Modifier
                .padding(bottom = 24.dp)
                .clip(RoundedCornerShape(percent = 50))
                .border(4.dp, Color.White, CircleShape)
        )

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp),
            color = Color.White
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            color = Color.White
        )
    }
}



@Preview(showBackground = true)
@Composable
fun BirthDayCardPreview() {
    MyApplicationTheme() {
        ComposeQuadrantApp()
    }
}