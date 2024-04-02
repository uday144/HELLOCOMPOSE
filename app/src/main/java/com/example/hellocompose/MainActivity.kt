package com.example.hellocompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hellocompose.ui.theme.HelloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewItem()
        }
    }
}


@Preview(widthDp = 300, heightDp = 500)
@Composable
fun previewCompose() {
    Column {
        listViewItem(R.drawable.bperson, "Uday Singh", "Software Engineer")
        listViewItem(R.drawable.bperson, "Ramakant", "Quality Engineer")
        listViewItem(R.drawable.bperson, "James Bont", "Software Engineer")
    }
}

@Composable
fun listViewItem(imageId: Int, name: String, occupation: String) {

    Row(Modifier.padding(10.dp)) {
        Image(
            painter = painterResource(id = imageId), contentDescription = "",
            Modifier.size(40.dp)
        )
        Column {
            Text(text = name, fontWeight = FontWeight.Bold)
            Text(text = occupation, fontWeight = FontWeight.Thin, fontSize = 12.sp)
        }

    }

}

