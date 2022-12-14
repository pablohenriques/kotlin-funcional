package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun main() {
    testaRun()
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(
        Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234), 1000
    )

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("rendimento mensal $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("simulacao rendimento anual: $rendimentoAnual")
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
