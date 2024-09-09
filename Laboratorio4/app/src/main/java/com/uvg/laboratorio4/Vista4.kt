package com.uvg.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.laboratorio4.ui.theme.Laboratorio4Theme

class EmergencyContactsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    EmergencyContactsScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun EmergencyContactsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Título
        Text(
            text = "Emergency Contacts",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )

        // Opción de Emergencia
        EmergencyContactOption(
            title = "Emergencias",
            description = "Si se presenta un incidente o un percance por favor marca el número de emergencia y rápidamente te apoyamos.",
            phone = "5978-1736",
            imageResourceId = R.drawable.emergencia
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Opción de Clínica UVG
        EmergencyContactOption(
            title = "Clínica UVG",
            description = "La Clínica UVG, presta los siguientes servicios:\n\n" +
                    "* Atención a Emergencias\n" +
                    "* Atención Primaria a Enfermedades Comunes\n" +
                    "* Plan Educacional sobre Enfermedades",
            phone = "2507-1500 ex 21312",
            imageResourceId = R.drawable.clinica
        )
    }
}

@Composable
fun EmergencyContactOption(
    title: String,
    description: String,
    phone: String,
    imageResourceId: Int
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp) // Solución para el error de elevación
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Imagen (Placeholder por el momento)
                Image(
                    painter = painterResource(id = imageResourceId),
                    contentDescription = null, // Puedes agregar una descripción si es necesario
                    modifier = Modifier
                        .size(40.dp)
                        .padding(end = 16.dp) // Espacio entre imagen y texto
                )

                // Título de la opción
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineSmall
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Descripción
            Text(
                text = description,
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Botón para llamar
            Button(
                onClick = { /* Acción para hacer la llamada */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)) // Corrección para backgroundColor
            ) {
                Text(text = "Call $phone", color = Color.White)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EmergencyContactsScreenPreview() {
    Laboratorio4Theme {
        EmergencyContactsScreen()
    }
}
