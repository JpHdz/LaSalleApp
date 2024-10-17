package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import coil.compose.AsyncImage
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.utils.subjectsList

@Composable
fun GradeSubjectScreen(subjectId:Int,innerPadding : PaddingValues) {
    val subject = subjectsList.first { it.id == subjectId }
//  Top de Calificacion
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        Column(modifier = Modifier.background(Color(0xFF002E5D)).fillMaxWidth().padding(horizontal = 16.dp, vertical = 50.dp)) {
        Text(
            text = "${subject.finalGrade}",
            fontSize = 64.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(start = 16.dp, top = 16.dp)
        )
        Text(
            text = subject.name,
            fontSize = 24.sp,
            color = Color.White,
            modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
        )
        Text(
            text = "Id de materia:${subject.id}",
            fontSize = 12.sp,
            color = Color.White,
            modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)

        )
        }
//     Lista de calificaciones desglozadas
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Primer Parcial",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
            }
            Text(
                text = "${subject.firstPartial}/10.0",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Segundo Parcial",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
            }
            Text(
                text = "${subject.secondPartial}/10.0",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF0F0F0), RoundedCornerShape(8.dp))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "Tercer Parcial",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
            }
            Text(
                text = "${subject.thirdPartial}/10.0",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )


        }
    }
}