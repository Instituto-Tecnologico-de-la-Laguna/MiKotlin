fun main() {
    // Este programa solicita cuatro números enteros al usuario,
    // calcula la suma de los dos primeros números,
    // y calcula el producto del tercer y cuarto número.

    // Solicitar los cuatro números enteros al usuario
    print("Ingrese el primer número: ")
    val num1 = readLine()!!.toInt()
    print("Ingrese el segundo número: ")
    val num2 = readLine()!!.toInt()
    print("Ingrese el tercer número: ")
    val num3 = readLine()!!.toInt()
    print("Ingrese el cuarto número: ")
    val num4 = readLine()!!.toInt()

    // Calcular la suma de los dos primeros números
    val suma = num1 + num2

    // Calcular el producto del tercer y cuarto número
    val producto = num3 * num4

    // Informar los resultados al usuario
    println("La suma de los dos primeros números es: $suma")
    println("El producto del tercer y cuarto número es: $producto")
}
