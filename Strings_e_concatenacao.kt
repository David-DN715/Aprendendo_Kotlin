/**
 * Strings!
 * **/
fun main() {
    val linguagem = "Kotlin"
    val caracteristica = "é show!"

    //Concatenando string
    println(linguagem + caracteristica)
    println(linguagem + " " + caracteristica)

    //interpolador
    println("$linguagem $caracteristica")

    //expresão
    println("este é o valor de Double.MAX_VALUE: ${Double.MAX_VALUE} ")
}
