package com.example.oop

// Herança: Pato herda de Passaro
class Pato : Passaro("Pato", "insetos e plantas aquáticas", true) {
    // Polimorfismo: Implementação específica para o som do pato
    override fun emitirSom() {
        println("QUACK")
    }
}
