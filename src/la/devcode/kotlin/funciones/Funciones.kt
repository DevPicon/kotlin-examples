package la.devcode.kotlin.funciones

/**
 * Created by armando on 12/6/16.
 */
fun main(args: Array<String>) {
    println(sumar(4, 5))
    println(esMayorDeEdad(17))
    println(esMayorDeEdad(18))
}

fun sumar(a: Int, b: Int) = a + b

fun esMayorDeEdad(edad: Int) = if (edad >= 18) true else false