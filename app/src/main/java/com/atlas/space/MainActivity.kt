
// Note: Fuck conventions. My thoughts are messy, so my code is messy but in a beautiful way. //

package com.atlas.space

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.ElevatedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

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

                    var MyState by remember { mutableStateOf("") }
                    var Nashville by remember { mutableStateOf("") }
                     val name = "Matthew"

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        ElevatedButton(onClick = { Nashville = Fly(MyState) }) {
                            Text(Nashville)
                        }
                        //WayLessSad()
                        OutlinedTextField(
                            value = MyState,
                            onValueChange = {London -> MyState = London},
                            label = {
                                Text("$name@Atlas_Interface")
                            }

                        )

                        Text(Nashville)

                        //StateTwin()

                        // calling it inline ish kinda equivalent now
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
@Composable
fun StateTwin() {




}
*/
/*@Composable
fun WayLessSad() {
    ElevatedButton(onClick = { Fly(MyState) }) {
        Text("Submit to Atlas")
    }
}
*/
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
fun WayLessSad() {
    ElevatedButton(onClick = { Fly("what is the time") }) {
        Text("AtlasVA")
    }
}
*/
//var MyState by remember { mutableStateOf("") }
