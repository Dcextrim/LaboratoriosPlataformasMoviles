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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Sección del perfil
        ProfileHeader()

        // Sección de opciones
        OptionsSection()
    }
}

@Composable
fun ProfileHeader() {
    // Imagen del usuario
    Image(
        painter = painterResource(id = R.drawable.perfil),
        contentDescription = "User Avatar",
        modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)
    )
    Text(
        text = "Usuario",
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
}

@Composable
fun OptionsSection() {
    OptionItem(icon = R.drawable.mycampus, title = "My Campus")
    OptionItem(icon = R.drawable.myfriends, title = "My Friends")
    OptionItem(icon = R.drawable.mycalendar, title = "My Calendar")
    OptionItem(icon = R.drawable.mycourses, title = "My Courses")
    OptionItem(icon = R.drawable.mygrades, title = "My Grades")
    OptionItem(icon = R.drawable.mygroups, title = "My Groups")
    OptionItem(icon = R.drawable.myupcomingevents, title = "My Upcoming Events")
}

@Composable
fun OptionItem(icon: Int, title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = title,
            modifier = Modifier.size(40.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = title,
            fontSize = 16.sp
        )
    }
}