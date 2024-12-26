package com.example.oop

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main()
    }
}

fun main() {
    val pato = Pato()
    val bemTeVi = BemTeVi()
    val pombo = Pombo()
    val galinha = Galinha()

    val passaros = listOf(pato, bemTeVi, pombo, galinha)

    for (passaro in passaros) {
        passaro.alimentar()
        passaro.emitirSom()
        passaro.voar()
        println("###################################")
    }
}