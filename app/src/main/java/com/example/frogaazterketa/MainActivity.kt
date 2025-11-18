package com.example.frogaazterketa

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.frogaazterketa.ui.theme.FrogaAzterketaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FrogaAzterketaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier.padding(5.dp)) {
    Column(
        modifier= modifier
            .background(color = Color.Red)
            .padding(1.dp) // 1 gehitzen dio jasotako paddingari, baina background aplikatu eta gero egiten denez, ez du kolorerik. PERO ESTÁ AQUÍ, AHORA MISMO.

        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Row (
            modifier= modifier
                .padding(10.dp)
                .background(color = Color.Blue)
                .fillMaxWidth()
            ,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ){
            Text(
                text = "a",
                modifier = Modifier.padding(10.dp)
            )
        }
        Row (
            modifier= Modifier
                .padding(1.dp)
                .background(color = Color.Blue).fillMaxWidth()
            ,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ){
            Text(
                text = "b",
                modifier = Modifier.padding(10.dp)
            )
        }
        Row (
            modifier= Modifier
                .padding(1.dp)
                .background(color = Color.Blue).fillMaxHeight()
            ,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ){
            Text(
                text = "c",
                modifier = Modifier.padding(10.dp)
            )
        }

    }
}

@Preview(showBackground = true, heightDp = 210, widthDp = 90)
@Composable
fun GreetingPreview() {
    FrogaAzterketaTheme {
        Greeting("Android")
    }
}