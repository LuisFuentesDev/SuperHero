package com.example.superhero

import kotlin.math.ceil

fun main() {
    var resultado = suma(6.5, 2.4F)
    println(resultado)
    var redondeo = redondeo(5.4)
    println(redondeo)
}

fun suma(param1: Double, param2: Float): Double = param1 + param2

fun redondeo(param1: Double) = ceil(param1)
