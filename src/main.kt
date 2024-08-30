fun main() {
    //println("Hello, World")//Edson Alemán Cueto
    println("Ingresa el primer número:")
    val x1 = readln().toInt()
    println("Ingresa el segundo número")
    val x2 = readln().toInt()
    println("Ingresa el tercer número")
    val x3 = readln().toInt()
    println("Ingresa el cuarto número")
    val x4 = readln().toInt()

    val suma = x1 + x2
    val multi = x3 * x4

    println("La suma de $x1 + $x2 es: $suma")
    println("El producto de $x3 * $x4 es: $multi")
}