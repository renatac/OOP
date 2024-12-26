package com.example.oop

abstract class Passaro(
    val nome: String,
    val habitoAlimentar: String,
    val podeVoar: Boolean
) {
    // Encapsulamento: propriedades são 'val' (imutáveis) e acessadas via getters

    // Polimorfismo: método 'emitirSom' é abstrato e deve ser implementado pelas subclasses
    abstract fun emitirSom()

    // Método comum a todos os pássaros
    fun alimentar() {
        println("$nome está se alimentando de $habitoAlimentar")
    }

    // Método que usa polimorfismo para voar ou não
    open fun voar() {
        if (podeVoar) {
            println("$nome está voando")
        } else {
            println("$nome não pode voar")
        }
    }
}
