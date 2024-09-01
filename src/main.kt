fun main() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese el tercer valor:")
    val valor3 = readln().toInt()
    print("Ingrese el cuarto valor:")
    val valor4 = readln().toInt()

    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")
    val producto = valor3 * valor4
    println("El producto de $valor3 y $valor4 es $producto")
}