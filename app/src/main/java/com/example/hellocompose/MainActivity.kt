package com.example.hellocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Hello Compose")
        }
    }
}


@Composable
fun helloCompose(name: String = "Compose") {
    Text(text = "Hello $name")
}

@Preview(widthDp = 150, heightDp = 50)
@Composable
fun previewCompose() {
    Button(
        onClick = { }, colors = ButtonDefaults.buttonColors(
            contentColor = Color.White
        ),
        enabled = false
    ) {
        Text(text = "Click me")
        Image(
            painter = painterResource(id = R.drawable.arrow), contentDescription = "arrow button",
            Modifier.rotate(180F)
        )
    }
}