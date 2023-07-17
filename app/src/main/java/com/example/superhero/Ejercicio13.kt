package com.example.superhero

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

fun main() {
    var resultado = suma(6.5, 2.4F)
    println(resultado)
    var redondeo = redondeo(5.4)
    println(redondeo)
    var muestraResultado = muestraResultado(6.7)
    println(muestraResultado)
}

fun suma(param1: Double, param2: Float): Double = param1 + param2

fun redondeo(param1: Double) = ceil(param1)

fun muestraResultado(numero: Double): String {

    var format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency (Currency.getInstance("EUR"))
    println (format.format(numero))
    return format.format(numero)
}