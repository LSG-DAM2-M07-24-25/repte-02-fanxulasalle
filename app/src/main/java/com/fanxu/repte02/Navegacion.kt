package com.fanxu.repte02


object Routes {
    val InicioScreen = "inicioScreen"
    val SeleccionScreen = "seleccionScreen"
    val NombreScreen = "nombreScreen/{personaje}"
    val ResultatScreen = "resultatScreen/{personaje}/{nombre}"

    val personaje = ""
    val nombre = ""

    fun escogerPersonaje(personaje: String): String {
        return "seleccionScreen/$personaje"
    }
}