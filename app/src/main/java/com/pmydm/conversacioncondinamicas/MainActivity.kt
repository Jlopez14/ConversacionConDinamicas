package com.pmydm.conversacioncondinamicas
import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmydm.conversacioncondinamicas.ui.theme.ConversacionConDinamicasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConversacionConDinamicasTheme {
                // A surface container using the 'background' color from the theme

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    Image(painter = painterResource(R.drawable.baloncestofondo),
                       contentDescription = "ImagenPerfil",
                        contentScale = ContentScale.FillBounds
                 )
                    Column {
                        Conversation(SampleData.conversationSample)

                    }
                }
            }
        }
    }
}



//Creamos la clase Message con sus variables
data class Message1( val author:String, val body: String)

//Esto es para hacer listas y animaciones
@Composable
fun Conversation(messages: List<Message1>){
    LazyColumn(){
        items(messages){ Message1
            -> Messagecard1(Message1)
        }
    }
}


//Primera funcion del mensaje
@Composable
fun Messagecard1(msg:Message1) {
    if (msg.author == "Michael") {
        Column {
            Spacer(modifier = Modifier.size(8.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.baloncestofondo),
                    contentDescription = "ImagenPerfil",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(
                            RoundedCornerShape(18.dp),
                        )
                )
                Spacer(modifier = Modifier.size(8.dp))

                var isExpanded by remember { mutableStateOf(false) }
                val surfaceColor by animateColorAsState(if (isExpanded) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface)

                Surface(
                    color = Color.LightGray,
                    border = BorderStroke(
                        1.dp,
                        color = MaterialTheme.colorScheme.primary
                    ),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .animateContentSize()
                        .padding(1.dp)
                )
                {
                    Column(modifier = Modifier
                        .padding(5.dp)
                        .clickable { isExpanded = !isExpanded }) {
                        Text(
                            msg.author,color = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            msg.body, maxLines = if (isExpanded) Int.MAX_VALUE else 1
                        )
                    }
                }
            }
        }
    }

    else if(msg.author == "Kobe"){
        Column {
            Spacer(modifier = Modifier.size(8.dp))
            Row {
                Image(
                    painter = painterResource(R.drawable.kobe),
                    contentDescription = "ImagenPerfil",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(
                            RoundedCornerShape(18.dp),
                        )
                )
                Spacer(modifier = Modifier.size(8.dp))

                var isExpanded by remember { mutableStateOf(false) }
                val surfaceColor by animateColorAsState(if(isExpanded)MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface)

                Surface(color= Color.LightGray,
                    border = BorderStroke(1.dp,
                        color = MaterialTheme.colorScheme.secondary),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .animateContentSize()
                        .padding(1.dp)  )
                {
                    Column(modifier= Modifier
                        .padding(5.dp)
                        .clickable { isExpanded = !isExpanded }) {
                        Text(
                            msg.author,color = MaterialTheme.colorScheme.secondary
                        )
                        Text(
                            msg.body,maxLines = if (isExpanded) Int.MAX_VALUE else 1
                        )
                    }
                }
            }
        }
    }
    else{
        Column {
            Spacer(modifier = Modifier.size(8.dp))
            Row(modifier= Modifier
                .padding(10.dp)
                .fillMaxWidth(),horizontalArrangement = Arrangement.End) {

                var isExpanded by remember { mutableStateOf(false) }
                val surfaceColor by animateColorAsState(if(isExpanded)MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface)

                Surface(color= Color.Gray,
                    border = BorderStroke(1.dp,
                        color = MaterialTheme.colorScheme.tertiary),
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier
                        .animateContentSize()
                        .padding(1.dp)
                )
                {
                    Column(modifier= Modifier
                        .padding(5.dp)
                        .clickable { isExpanded = !isExpanded }) {
                        Text(
                            msg.author,color = MaterialTheme.colorScheme.tertiary
                        )
                        Text(
                            msg.body,maxLines = if (isExpanded) Int.MAX_VALUE else 1
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = false)
@Composable
fun PreviewConversation(){
    ConversacionConDinamicasTheme{
        Conversation(SampleData.conversationSample )
    }
}

