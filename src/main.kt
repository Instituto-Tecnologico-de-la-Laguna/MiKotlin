fun main() {
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de $valor1 y $valor2 es $suma")

    print("Ingrese tercer valor:")
    val valor3 = readLine()!!.toInt()
    print("Ingrese cuarto valor:")
    val valor4 = readLine()!!.toInt()
    val producto = valor3 * valor4
    println("El producto de $valor3 y $valor4 es $producto")
}