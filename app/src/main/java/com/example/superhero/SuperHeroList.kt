package com.example.superhero

data class Heroe(
    val superHero: String,
    val publisher: String,
    val realName: String,
    val photo: String
)

fun main() {
    var i = 0

    var cant: Int = 1

    var heroes = mutableListOf<Heroe>()

    while (cant == 1) {
        println("Nombre: ")
        var nombre = readln()
        println("Publisher: ")
        var publisher = readln()
        println("Nombre real: ")
        var realName = readln()
        println("Foto: ")
        var photo = readln()
        heroes.add(Heroe(nombre, publisher, realName, photo))

        println("Ingrese 1 para seguir: ")
        cant = readln().toInt()
    }

    for (h in heroes) {
        println(h)
    }


}