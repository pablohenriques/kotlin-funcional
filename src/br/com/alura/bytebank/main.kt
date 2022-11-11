package br.com.alura.bytebank

fun main() {
    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
//    val minhaFuncaoLambda = {
//        println("Executa como Lambda")
//    }
//    println(minhaFuncaoLambda)
//
//    val minhaFuncaoAnonima: () -> Unit = fun() {
//        println("Executa como anonima")
//    }
//    println(minhaFuncaoAnonima)
}

private fun testaTipoFuncaoClasse() {
    val cs: (Int, Int) -> Int = Soma()
    println(cs(10, 15))
}

private fun testaTipoFuncaoReferencia() {
    val s: (Int, Int) -> Int = ::soma
    println(s(10, 10))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}