package br.com.alura.bytebank

fun main() {
    val minhaFuncaoLambda = {
        println("Executa como Lambda")
    }
    println(minhaFuncaoLambda)

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anonima")
    }
    println(minhaFuncaoAnonima)
}

private fun testaTipoFuncaoClasse() {
    val cm: () -> Unit = CMensagem()
}

private fun testaTipoFuncaoReferencia() {
    val m: () -> Unit = ::mensagem
}

fun mensagem() {
    println("Funcao Mensagem")
}

class CMensagem : () -> Unit {
    override fun invoke() {
        println("Classe de Mensagem")
    }
}