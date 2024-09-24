package com.uvg.laboratorio4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.uvg.laboratorio4.ui.theme.Laboratorio4Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Ajustescreen(navController: NavController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Settings",
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                actions = {
                    Image(
                        painter = painterResource(id = R.drawable.equis),
                        contentDescription = "Cerrar",
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .clickable {
                                navController.popBackStack() // Acción para regresar
                            }
                            .size(24.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.White)
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp)
            ) {
                // Opciones de la lista con íconos
                Ajustesformato(title = "Edit Profile", imageResourceId = R.drawable.perfil)
                Ajustesformato(title = "Email Addresses", imageResourceId = R.drawable.correo)
                Ajustesformato(title = "Notifications", imageResourceId = R.drawable.notificacion)
                Ajustesformato(title = "Privacy", imageResourceId = R.drawable.privacidad)

                Column {
                    Ajustesformato(title = "Help & Feedback", imageResourceId = R.drawable.ayuda)
                    Text("Troubleshooting tips and guides", fontSize = 14.sp)
                }
                Column {
                    Ajustesformato(title = "About", imageResourceId = R.drawable.acerca)
                    Text("App Information and Documents", fontSize = 14.sp)
                }

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
    )
}

@Composable
fun Ajustesformato(title: String, imageResourceId: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        // Imagen
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
fun PreviewSettings() {
    Laboratorio4Theme {
        Ajustescreen(rememberNavController())
    }
}
