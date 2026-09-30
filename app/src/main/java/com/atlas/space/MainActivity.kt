package com.atlas.space

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.ElevatedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.atlas.space.ui.theme.AtlasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Adrenaline.setup(this)

        enableEdgeToEdge()
        setContent {
            AtlasTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    @Composable
                    fun ButtonToStart() {
                        ElevatedButton(onClick = { Fly("where is my banana") }) {
                            Text("AtlasVA")
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        contentAlignment = Alignment.Center

                    ) {
                        ButtonToStart()
                    }
                    /*
                    Greeting(
                        name = "Matthew",
                        modifier = Modifier.padding(innerPadding)

                    )

                     */
                }
            }
        }
    }
}
/*
// Top Bar//
Scaffold(
    topBar = {
        TopBar(title= "Greeting")
    },

) { innerPadding ->
Box(modifier = Modifier.padding(innerPadding)) {
    Text("MainActivity")
}
}
*/

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AtlasTheme {
        Greeting("Matthew")
    }
}
/*
@Preview(showBackground = true)
@Composable
fun ButtonToStart() {
    ElevatedButton(onClick = { Fly("what is the time") }) {
        Text("AtlasVA")
    }
}
*/
//var MyState by remember { mutableStateOf("") }
