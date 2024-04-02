package com.example.hellocompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(heightDp = 500)
@Composable
fun PreviewItem() {

    LazyColumn(content = {
         items ( getCategoryList()){ item ->
             BlogCategory(item.img, item.title, item.subtitle)
         }
    } )

/*    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategoryList().map { item ->
            BlogCategory(item.img, item.title, item.subtitle)
        }
    }*/
}

@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        shape = RoundedCornerShape(5.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img), contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, Modifier.Companion.weight(.8f))
        }

    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.bperson, "Programming 1", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 2", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 3", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 4", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 5", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 6", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 7", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 8", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 9", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 10", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 11", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 12", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 13", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 14", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 15", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 16", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 17", "Learn different languages"))
    list.add(Category(R.drawable.bperson, "Programming 18", "Learn different languages"))
    return list
}