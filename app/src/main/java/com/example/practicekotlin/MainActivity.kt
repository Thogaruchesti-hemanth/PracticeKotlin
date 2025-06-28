package com.example.practicekotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicekotlin.ui.theme.PracticeKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeKotlinTheme {
               Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = MaterialTheme.colorScheme.background
               ) {
                   BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(210, 232, 212)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(
                modifier = Modifier
                    .background(Color(41, 70, 86))
                    .padding(12.dp)
                    .size(120.dp)
            ) {
                Image(
                    painter = image,
                    contentDescription = "android Logo",
                )
            }
            Text(
                text = "Thogaruchesti Hemanth",
                style = TextStyle(
                    fontSize = 22.sp,
                    letterSpacing = 0.8.sp
                ),
                modifier = modifier
                    .padding(vertical = 8.dp)
            )
            Text(
                text = "Android Developer Extraordinaire",
                style = TextStyle(
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 14.sp,
                    color = Color(44, 133, 90),
                )
            )
        }
    }
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.Start,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp, vertical = 60.dp)

        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.Phone,
                    contentDescription = "Mobile Icon",
                    tint = Color(44, 133, 90)
                )
                Text(
                    text = "+11 (123) 444 555 666",
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.Share,
                    contentDescription = "Mobile Icon",
                    tint = Color(44, 133, 90)
                )
                Text(
                    text = "@AndroidDev",
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.Email,
                    contentDescription = "Mobile Icon",
                    tint = Color(44, 133, 90)
                )
                Text(
                    text = "jen.doe@android.com",
                    style = TextStyle(
                        fontSize = 14.sp
                    )
                )
            }
        }
    }
}


@Preview(
    showSystemUi = true
)
@Composable
fun BusinessCardPreview(){
    BusinessCard()
}