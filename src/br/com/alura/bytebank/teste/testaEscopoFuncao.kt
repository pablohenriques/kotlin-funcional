package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

private fun testeEscopo() {
    run {
        println("execução do run sem extensão")
    }

    val endereco = Endereco()
        .also { println("Criando Endereço") }
        .apply {
            logradouro = "rua vergeuiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))
}

