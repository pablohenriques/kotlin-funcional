package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    testaWith()
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3128
        bairro = "Vila Mariana"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apartamento"
        completo()
    }.let { endereco: String ->
        println(endereco)
    }
}
