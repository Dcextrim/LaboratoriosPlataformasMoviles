package com.uvg.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CampusCentralScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CampusCentralScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.verticalScroll(rememberScrollState())) {
        // Título de la pantalla "Campus Central" en la parte superior
        Text(
            text = "Campus Central",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )

        // Imagen principal
        Image(
            painter = painterResource(id = R.drawable.campuscentral),
            contentDescription = "Campus Central",
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Sección de Destacados
        Text(
            text = "DESTACADOS",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, bottom = 8.dp)
        )

        // Primera fila de cards (Destacados)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.servicenow),
                        contentDescription = "Service Now",
                        modifier = Modifier
                            .size(80.dp)
                            .background(Color.White)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFF4CAF50))
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Service Now",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.actualidaduvg),
                        contentDescription = "Actualidad UVG",
                        modifier = Modifier
                            .size(80.dp)
                            .background(Color.White)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFF4CAF50))
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Actualidad UVG",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Sección de Servicios y Recursos
        Text(
            text = "SERVICIOS Y RECURSOS",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, bottom = 8.dp)
        )

        // Segunda fila de cards (Servicios y Recursos)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.directorioservicios),
                        contentDescription = "Directorio de Servicios Estudiantiles",
                        modifier = Modifier
                            .size(80.dp)
                            .background(Color.White)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFF4CAF50))
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Directorio de Servicios Estudiantiles",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }

            Card(
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.portalwebbibliotecas),
                        contentDescription = "Portal Web Bibliotecas UVG",
                        modifier = Modifier
                            .size(80.dp)
                            .background(Color.White)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color(0xFF4CAF50))
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Portal Web Bibliotecas UVG",
                            style = MaterialTheme.typography.bodyLarge,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun Ajustescreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Título
        Text(
            text = "Settings",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )

        // Opciones de la lista con íconos
        Ajustesformato(title = "Edit Profile", imageResourceId = R.drawable.perfil)
        Ajustesformato(title = "Email Addresses", imageResourceId = R.drawable.correo)
        Ajustesformato(title = "Notifications", imageResourceId = R.drawable.notificacion)
        Ajustesformato(title = "Privacy", imageResourceId = R.drawable.privacidad)

        Column {
            Ajustesformato(title = "Help & Feedback", imageResourceId = R.drawable.ayuda)
            Text("Troubleshooting tips and guides")
        }
        Column{
            Ajustesformato(title = "About", imageResourceId = R.drawable.perfil)
             Text("App Information and Documents")

        }
        Ajustesformato(title = "About", imageResourceId = R.drawable.perfil)

        // Espacio para Logout
        Spacer(modifier = Modifier.weight(1f))

        // Botón de Logout
        TextButton(
            onClick = { /* Acción de Logout */ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Logout", color = Color.Red)
        }
    }
}

@Composable
fun Ajustesformato(title: String, imageResourceId: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        // Imagen (Placeholder por el momento)
        Image(
            painter = painterResource(id = imageResourceId),
            contentDescription = null, // Puedes agregar una descripción si es necesario
            modifier = Modifier
                .size(50.dp)
                .padding(end = 16.dp) // Espacio entre imagen y texto
        )

        // Texto de la opción
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Preview(showBackground = true)
@Composable
fun Previewspantallas() {
    Laboratorio4Theme {
        Ajustescreen()
    }
}
