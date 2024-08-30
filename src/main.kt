fun main() {
    // Solicitar cuatro números enteros al usuario
    print("Ingrese el primer número: ")
    val num1 = readLine()?.toIntOrNull() ?: 0

    print("Ingrese el segundo número: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    print("Ingrese el tercer número: ")
    val num3 = readLine()?.toIntOrNull() ?: 0

    print("Ingrese el cuarto número: ")
    val num4 = readLine()?.toIntOrNull() ?: 0

    // Calcular la suma de los dos primeros números
    val suma = num1 + num2

    // Calcular el producto del tercer y cuarto número
    val producto = num3 * num4

    // Informar los resultados
    println("La suma de los dos primeros números es: $suma")
    println("El producto del tercer y cuarto número es: $producto")
}