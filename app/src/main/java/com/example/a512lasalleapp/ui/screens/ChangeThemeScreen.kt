package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.ui.components.ScreenTemplate

@Composable
fun ChangeThemeScreen(innerPadding: PaddingValues, navController: NavController, student: Student) {
    ScreenTemplate(innerPadding = innerPadding, header = {
        Text(text = "Change Theme Screen")
    }, body = {
        Text("Change Theme Screen")
    })
}