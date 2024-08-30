fun main(argumento: Array<String>) {
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")
    print("Ingrese tercer valor:")
    val valor3 = readln().toInt()
    print("Ingrese cuarto valor:")
    val valor4 = readln().toInt()
    val producto = valor3 * valor4
    println("El resultado de $valor3 y $valor4 es $producto")
}