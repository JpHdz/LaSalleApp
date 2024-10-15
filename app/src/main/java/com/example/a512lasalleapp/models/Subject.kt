package com.example.a512lasalleapp.models

data class Subject (
    val id: Int,
    val name: String,
    val firstPartial: Double,
    val secondPartial: Double,
    val thirdPartial: Double
){
    val finalGrade: Double
        get(){
            val finalCalculated = (firstPartial * 0.2) + (secondPartial * 0.2) + (thirdPartial * 0.6)
            return String.format("%.1f",finalCalculated).toDouble()
        }
}