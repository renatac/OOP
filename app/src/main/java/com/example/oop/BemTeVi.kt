package com.example.oop

// Através da Herança: BemTeVi herda de Passaro
class BemTeVi : Passaro("Bem-te-vi", "insetos e frutas", true) {
    // Através do Polimorfismo: Implementação específica para o som do bem-te-vi
    override fun emitirSom() {
        println("BEM-TE-VI")
    }
}