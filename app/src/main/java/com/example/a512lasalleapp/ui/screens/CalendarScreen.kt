package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.ui.components.DayItem
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun CalendarScreen(innerPadding: PaddingValues) {
    ScreenTemplate(innerPadding = innerPadding, header = {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "Calendario",
                color = Color.White,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                modifier = Modifier.padding(top = 10.dp),
                text = "Enero",
                color = Color.White,
                style = MaterialTheme.typography.titleLarge
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            ) {
                items(31){
                    DayItem()
                }
            }
        }
    }, body = {
        Text("Hola")
    })
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CalendarScreenPreview() {
    _512LaSalleAppTheme {
        CalendarScreen(innerPadding = PaddingValues(0.dp))
    }
}