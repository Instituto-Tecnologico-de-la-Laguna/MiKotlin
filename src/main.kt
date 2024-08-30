fun main() {

    val scanner = java.util.Scanner(System.`in`)

    println("Neo Brandon Maldonado Paz\n")

    println("Ingrese el primer número entero:")
    val n1 = scanner.nextInt()

    println("Ingrese el segundo número entero:")
    val n2 = scanner.nextInt()

    println("Ingrese el tercer número entero:")
    val n3 = scanner.nextInt()

    println("Ingrese el cuarto número entero:")
    val n4 = scanner.nextInt()

    // Calcular la suma de los dos primeros números
    val suma = n1 + n2

    // Calcular el producto del tercer y cuarto número
    val producto = n3 * n4

    // Los resultados aqui
    println("La suma de los dos primeros números es: $suma")
    println("El producto del tercer y cuarto número es: $producto")
}
