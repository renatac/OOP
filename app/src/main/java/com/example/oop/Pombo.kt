package com.example.oop

// Herança: Pombo herda de Passaro
class Pombo : Passaro("Pombo", "sementes e restos de comida", true) {
    // Polimorfismo: Implementação específica para o som do pombo
    override fun emitirSom() {
        println("CURRU-CURRU")
    }
}