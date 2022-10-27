package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class praktikumbaru :ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            DiceApp()

        }
    }
}
@Preview
@Composable
fun DiceApp(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        var diceValue by remember {
            mutableStateOf(value:1)
        }
        val image=when (diceValue){
            1 -> R.drawable.dice_1

        }
        Image(painterResource(id =R.drawable. ) ,
            contentDescription = null )
        Spacer(
            modifier =Modifier.height(28.dp)
        )
        Button(onClick = { /*TODO*/
        diceValue = listOf<Int>(1,6)}) {

        }

    }
}