package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.background(color =Color.Gray).fillMaxSize()

                ) {
                    BusinessCard()
                }
            }
        }
    }
}



@Composable
fun BusinessCard() {
    Box(
        modifier = Modifier.background(color = Color.White).padding(top = 340.dp, start = 159.dp)

    )
    Column(
        modifier = Modifier.padding(top = 360.dp, start = 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.DP)
        Image(
            painter = image, contentDescription = null, modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
        Text(text = "Tim Scot", color = Color.White)
        Text(text = "Engineer", color = Color(0xFF3ddc84))
        Text(text = "4235346XXX", color = Color.White)
        Text(text = "timscotxx@xxx,com", color = Color(0xFF3ddc84))

    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Surface{
            BusinessCard()
        }

    }
}