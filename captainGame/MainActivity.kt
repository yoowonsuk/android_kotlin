package eu.tutorials.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import eu.tutorials.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }
    @Composable
    fun CaptainGame() {
        //val treasureFound = remember { mutableStateOf(0)}
        var treasureFound by remember { mutableStateOf(0)}
        val direction = remember{ mutableStateOf("North")}
        val stormOrTreasure = remember{ mutableStateOf("")}
        Column {
            //Text(text = "Treasures Found: ${treasureFound.value}")
            Text(text = "Treasures Found: ${treasureFound}")
            Text(text = "Current Direction: ${direction.value}")
            Button(onClick = {
                direction.value = "East"
                if(Random.nextBoolean()) {
                    //treasureFound.value += 1
                    treasureFound += 1
                    stormOrTreasure.value = "Found a Treasure"
                } else
                    stormOrTreasure.value = "Storm Ahead!"
            }) {
                Text("Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if(Random.nextBoolean()) {
                    //treasureFound.value += 1
                    treasureFound += 1
                    stormOrTreasure.value = "Found a Treasure"
                } else
                    stormOrTreasure.value = "Storm Ahead!"
            }) {
                Text("Sail West")
            }
            Button(onClick = {
                direction.value = "South"
                if(Random.nextBoolean()) {
                    //treasureFound.value += 1
                    treasureFound += 1
                    stormOrTreasure.value = "Found a Treasure"
                } else
                    stormOrTreasure.value = "Storm Ahead!"
            }) {
                Text("Sail South")
            }
            Button(onClick = {
                direction.value = "North"
                if(Random.nextBoolean()) {
                    //treasureFound.value += 1
                    treasureFound += 1
                    stormOrTreasure.value = "Found a Treasure"
                } else
                    stormOrTreasure.value = "Storm Ahead!"
            }) {
                Text("Sail North")
            }
            Text(text = "stormOrTreasure: ${stormOrTreasure.value}")
        }
    }
}

