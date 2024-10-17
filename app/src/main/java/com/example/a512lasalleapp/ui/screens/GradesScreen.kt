package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.models.Subject
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.utils.Screens


@Composable
fun GradesScreen(innerPadding: PaddingValues, student: Student, navController: NavController) {
    Column(modifier = Modifier
        .padding(innerPadding)
        .padding(vertical = 50.dp, horizontal = 20.dp)) {
        Text(text = student.fullName, style = MaterialTheme.typography.headlineMedium)
        Text(text = student.carrer.name, style = MaterialTheme.typography.bodyLarge)
        Text(text = "Semestre: ${student.semester}", style = MaterialTheme.typography.bodyMedium)
        Text(
            text = "Promedio General: ${String.format("%.1f", student.averageGrade)}",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Calificaciones", fontSize = 20.sp, color = Color(0xFF002E5D))
//        Lista de Materias
        LazyColumn {
            items(student.subjects) { subject ->
                SubjectItem(subject = subject) {
                    navController.navigate("${Screens.GradeSubject.route}/${subject.id}")
                }
            }
        }
    }
}

@Composable
fun SubjectItem(subject: Subject, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(vertical = 20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = subject.name,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = "${String.format("%.1f", subject.finalGrade)}",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold
        )
    }
    Spacer(modifier = Modifier.height(4.dp))
    var progress = subject.finalGrade.coerceIn(0.0, 10.0) / 10f
//    Linea de progresion en base a 10, agregar 0 si se desea hacer en base sobre 100
    LinearProgressIndicator(progress = { progress.toFloat() }, modifier = Modifier
        .fillMaxWidth()
        .height(8.dp),
        color = Color(0xFF002E5D),
        trackColor = Color(0xFFE0E0E0) )
    Divider()
}
