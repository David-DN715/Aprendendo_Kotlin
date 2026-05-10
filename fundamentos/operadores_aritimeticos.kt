/**
 * Operadores aritimeticos
 * **/
fun main() {
    val soma = 2+2
    val subtracao = 2-2
    val divisao = 2/2
    val mult = 2*2
    val resto = 10%3

    var valor1 = 0
    var valor2 = 0

    //Podemos usar assim, pois o kotlin consegue identificar!
    println(2+2)
    println("--------")
    println("Soma")
    println(soma)
    println("Subtracao")
    println(subtracao)
    println("Divisao")
    println(divisao)
    println("multiplicação")
    println(mult)
    println("Resto")
    println(resto)

    //Atribuindo valores a uma variavel
    valor1 = valor1 + 15
    println("Valor de valor1 = valor1 + 15: $valor1")
    valor2 += 15
    println("valor de valor2 += 15: $valor2")
}
