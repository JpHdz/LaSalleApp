package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.models.Payment
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.utils.paymentsList

@Composable
fun PaymentsScreen(innerPadding: PaddingValues, navController: NavController, student: Student) {
    var paymentsList = paymentsList
    Column {
        FelinoGreetingScreen()
    Spacer(modifier = Modifier.height(30.dp))
        Text(
            "Lista de Pagos",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )
        LazyColumn {
            items(paymentsList) { payment ->
                PaymentItem(payment)
            }
        }
    }
}

@Composable
fun FelinoGreetingScreen() {
    Box(
        modifier = Modifier
            .background(Color(0xFF002E5D))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center).padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,

        ) {
            Text(
                text = "PONTE AL DIA \nCON FELINO",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = R.drawable.felino),
                contentDescription = "Felinito",
                modifier = Modifier.size(200.dp)
            )
        }
    }
}


@Composable
fun PaymentItem(payment: Payment) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = if (payment.paid) Icons.Default.CheckCircle else Icons.Default.Warning,
            contentDescription = if (payment.paid) "Pagado" else "Pendiente",
            tint = if (payment.paid) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(payment.period, style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.weight(1f))
        Text(
            if (payment.paid) "Pagado" else "Vence: \n${payment.dueDate}",
            color = if (payment.paid) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error,
            textAlign = TextAlign.End
        )
    }
}