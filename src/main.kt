/*
 * Programa: Cálculo de Suma y Producto de Cuatro Números
 * Descripción: Este programa solicita al usuario que ingrese cuatro números enteros,
 *              calcula la suma de los dos primeros números y el producto del tercer
 *              y cuarto número, y luego muestra los resultados.
 * 
 * Autor: Carlos Lopez Trujillo 
 * Número de Control: 19130933
 * Fecha: 01/09/2024
 */


fun main() {
    // Solicitar al usuario que ingrese cuatro números enteros
    println("Ingrese el primer número:")
    val num1 = readLine()!!.toInt()

    println("Ingrese el segundo número:")
    val num2 = readLine()!!.toInt()

    println("Ingrese el tercer número:")
    val num3 = readLine()!!.toInt()

    println("Ingrese el cuarto número:")
    val num4 = readLine()!!.toInt()

    // Calcular la suma de los dos primeros números
    val suma = num1 + num2

    // Calcular el producto del tercer y cuarto número
    val producto = num3 * num4

    // Informar los resultados al usuario
    println("La suma de los dos primeros números es: $suma")
    println("El producto del tercer y cuarto número es: $producto")
}
