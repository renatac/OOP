package com.example.oop

// Herança: Galinha herda de Passaro
class Galinha : Passaro("Galinha", "milho e minhocas", false) {
    // Polimorfismo: Implementação específica para o som da galinha
    override fun emitirSom() {
        println("COCÓ-CÓ")
    }
    // Polimorfismo: Implementação específica para o voo da galinha
    override fun voar() {
        println("$nome não pode voar muito alto")
    }
}