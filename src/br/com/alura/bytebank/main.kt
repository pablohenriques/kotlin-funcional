package br.com.alura.bytebank

fun main() {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

    val funcLambda = { a: Int, b: Int ->
        a + b
    }
    println(funcLambda(15, 10))

    val funcAnonima = fun(a: Int, b: Int) : Int {
        return a + b
    }
    println(funcAnonima(20, 10))
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