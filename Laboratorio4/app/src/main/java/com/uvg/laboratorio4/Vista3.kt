package com.uvg.laboratorio4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.laboratorio4.ui.theme.Laboratorio4Theme


@Composable
fun Ajustescreen(modifier: Modifier = Modifier) {
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
            Ajustesformato(title = "About", imageResourceId = R.drawable.acerca)
            Text("App Information and Documents")

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
fun Previewspantallas() {
    Laboratorio4Theme {
        Ajustescreen()
    }
}