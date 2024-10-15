package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.a512lasalleapp.models.Student

import com.example.a512lasalleapp.ui.components.ScreenTemplate

@Composable
fun SettingsScreen(innerPadding : PaddingValues, student: Student, navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Información del alumno
        StudentInfo()

        Spacer(modifier = Modifier.height(24.dp))

        // Lista de opciones
        ConfigurationOptions(navController)
    }
}
@Composable
fun StudentInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        // Imagen circular del alumno
//        AsyncImage(
//            model = ImageRequest.Builder(LocalContext.current)
//                .placeholder(R.drawable.portrait_1)
//                .data(students.photo)
//                .build(),
//            contentDescription = "CardImage",
//            modifier = Modifier.fillMaxWidth().height(200.dp),
//            contentScale = ContentScale.Crop
//
//        Spacer(modifier = Modifier.height(16.dp))

        // Información del alumno
        Text(text = "Nombre Completo", fontWeight = FontWeight.Bold)
        Text(text = "Fecha de Nacimiento: 01/01/2000")
        Text(text = "Correo: alumno@institucion.edu")
    }
}

@Composable
fun ConfigurationOptions(navController: NavController) {
    Column {
        Text(
            text = "Opciones",
//            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        // Opción para cambiar contraseña
        ConfigOptionItem(
            text = "Cambiar contraseña",
            onClick = { navController.navigate("change_password") }
        )

        // Opción para cambiar tema
        ConfigOptionItem(
            text = "Cambiar tema de la aplicación",
            onClick = { navController.navigate("change_theme") }
        )
    }
}

@Composable
fun ConfigOptionItem(text: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
//        elevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = text)
            IconButton(onClick = onClick) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Ir a $text"
                )
            }
        }
    }
}