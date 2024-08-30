
// PRACTICA 1
// Juan Fernando Vaquera Sanchez
// 21130869
// Modificar el  programa en el cual se ingresen cuatro números enteros,
// calcular e informar la suma de los dos primeros
// y el producto del tercero y el cuarto

fun main() {

    print("Ingrese el numero 1: ")
    val num1 = readln().toInt()

    print("Ingrese el numero 2: ")
    val num2 = readln().toInt()

    print("Ingrese el numero 3: ")
    val num3 = readln().toInt()

    print("Ingrese el numero 4: ")
    val num4 = readln().toInt()

    println("La suma de $num1 y $num2 es ${sumar(num1, num2)}")

    println("El producto de $num3 y $num4 es ${multiplicar(num3, num4)}")
}

fun sumar(val1: Int, val2: Int): Int {
    return val1 + val2
}

fun multiplicar(val3: Int, val4: Int): Int {
    return val3 * val4
}
