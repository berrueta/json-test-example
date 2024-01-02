package com.example.demo

data class Widget(
    val name : String,
    val weight : Weight,
)

data class Weight(
    val value : Double,
    val units : String,
)