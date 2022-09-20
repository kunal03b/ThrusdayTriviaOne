package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.ui.theme.JetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Home()
                }
            }
        }
    }
}
@Composable
fun Home(){
    var backgroundImage = painterResource(R.drawable.logo)

    Box {
        Column() {

        }

            Image(painter = backgroundImage, contentDescription = null,
                modifier = Modifier
                    .padding(top = 40.dp)
//                    .size(250.dp)
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
            )
        Column() {
            Text(text = "Sushant Dhiman",color= Color(56,112,179,255),fontSize=38.sp, fontWeight = FontWeight.Bold, modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally).padding(top = 440.dp))
            Text(text = "❤", fontSize = 50.sp,modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally).padding(top=25.dp))
            Text(text = "Jetpack Compose", fontSize = 40.sp,color=Color(8,48,66,255), fontWeight = FontWeight.Bold,modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally).padding(top = 25.dp))

        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetPackTheme {
//        Greeting("Android")
//    }
//}