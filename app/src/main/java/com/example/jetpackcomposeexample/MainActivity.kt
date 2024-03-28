package com.example.jetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewMessageCard()
        }
    }
}


@Composable
fun MessageCard(message: Message) {

    Row (modifier = Modifier.padding(all = 10.dp)){

        Image(painter = painterResource(id = R.drawable.ic_profile), contentDescription = "Sharingan from infinite tsukuyomi"

            ,modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(10.dp))
        Column {


            Text(text = message.author)
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = message.body)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {
    MessageCard(Message("Atul", "You have to stop wasting time for once buddy"))
}

data class Message(val author: String, val body: String)