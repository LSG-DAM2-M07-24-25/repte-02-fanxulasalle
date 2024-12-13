package com.fanxu.repte02


object Routes {
    val InicioScreen = "inicioScreen"
    val SeleccionScreen = "seleccionScreen"
    val NombreScreen = "nombreScreen/{nombre}"
    val ResultatScreen = "resultatScreen"

    val personaje = ""
    val nombre = ""

    fun escogerPersonaje(personaje: String): String {
        return "seleccionScreen/$personaje"
    }
}