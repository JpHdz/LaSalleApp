package com.example.a512lasalleapp.models

data class Student (
    val id: Int,
    val fullName: String,
    val birthdate: String,
    val email : String,
    val photo: String,
    val semester: Int,
    val carrer: Career,
    val subjects: List<Subject>,
    val payments: List<Payment> = emptyList()
    ){
    val averageGrade: Double
        get(){
            val totalSubjects = subjects.size
            if(totalSubjects == 0) return 0.0
            val sumGrades = subjects.sumOf {it.finalGrade}
            val average = sumGrades / totalSubjects
            return String.format("%.1f",average).toDouble()
        }
}
