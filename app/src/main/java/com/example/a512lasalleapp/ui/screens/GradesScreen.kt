package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun GradesScreen(innerPadding : PaddingValues){
    Box(modifier = Modifier.padding(innerPadding).fillMaxSize()){
        Text("Calificaciones")
    }
}