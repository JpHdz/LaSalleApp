package com.example.a512lasalleapp.ui.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import com.example.a512lasalleapp.models.BottomNavigationItem
import com.example.a512lasalleapp.models.Career
import com.example.a512lasalleapp.models.Community
import com.example.a512lasalleapp.models.News
import com.example.a512lasalleapp.models.Payment
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.models.Subject

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image =  "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val bottomNavBarItems = listOf(
    BottomNavigationItem(
        title = "Inicio",
        icon = Icons.Default.Home,
        route = Screens.Home.route
    ),
    BottomNavigationItem(
        title = "Calificaciones",
        icon = Icons.Default.Menu,
        route = Screens.Grades.route
    ),
    BottomNavigationItem(
        title = "Calendario",
        icon = Icons.Default.DateRange,
        route = Screens.Calendar.route
    ),
    BottomNavigationItem(
        title = "Configuracion",
        icon = Icons.Default.Settings,
        route = Screens.Settings.route
    ),
)

val communities = listOf(
    Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2,"https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3,"https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg  "),
    Community(4,"https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5,"https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),
)

val subjectsList = listOf(
    Subject(id = 1, name = "Desarrollo Android", firstPartial = 10.0, secondPartial = 10.0, thirdPartial = 10.0),
    Subject(id = 2, name = "Redes Y Ruteo", firstPartial = 8.5, secondPartial = 7.5, thirdPartial = 10.0),
    Subject(id = 3, name = "Bases de Datos", firstPartial = 10.0, secondPartial = 8.0, thirdPartial = 10.0),
    Subject(id = 4, name = "Procesamiento de Imagenes", firstPartial = 6.0, secondPartial = 6.0, thirdPartial = 10.0)
)
val careerList = listOf(
    Career(id = 1, name = "ISSC")
)

val paymentsList = listOf(
    Payment(1, "AG0-SEP 2024", "12 AGOSTO 2024", true),
    Payment(2, "SEP-OCT 2024", "12 SEPTIEMBRE 2024", true),
    Payment(3, "OCT-NOV 2024", "12 OCTUBRE 2024", true),
    Payment(4, "NOV-DIC 2024", "12 DICIEMBRE 2024", false),



    )

val studentsList = listOf(
    Student(
        id = 1,
        fullName = "Arthur William",
        birthdate = "12/10/1890",
        email = "mrarthurwilliam@wester.com",
        carrer = careerList[0],
        semester = 6,
        subjects = subjectsList,
        payments = paymentsList,
    )
)
