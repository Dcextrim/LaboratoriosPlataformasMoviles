package com.uvg.laboratorio1plataformasmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.laboratorio1plataformasmoviles.ui.theme.Laboratorio1PlataformasMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio1PlataformasMovilesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MyScreen(modifier: Modifier = Modifier) {
    var showMessage by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Plataformas Moviles")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Laboratorio 1 - Conociendo Android Studio")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Daniel Chet")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            showMessage = true
            android.util.Log.d("MyScreen", "Button clicked")
        }) {
            Text(text = "Presionar")
        }
        if (showMessage) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Hola!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyScreenPreview() {
    Laboratorio1PlataformasMovilesTheme {
        MyScreen()
    }
}
