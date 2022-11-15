package br.com.alura.bytebank.teste

private fun testaFuncaoAnonima() {
    val funcAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(funcAnonima(20, 10))


    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculadoraBonificacaoAnonima(1100.0))
}

private fun testaFuncaoLambda() {
    val funcLambda = { a: Int, b: Int ->
        a + b
    }
    println(funcLambda(15, 10))
    val calculadoraBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        salario + 100
    }
    println(calculadoraBonificacao(1000.0))
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