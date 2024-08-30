fun main() {
    print("Ingrese el primer valor: ")
    val v1 = readln().toInt()

    print("Ingrese el segundo valor: ")
    val v2 = readln().toInt()

    print("Ingrese el tercer valor: ")
    val v3 = readln().toInt()

    print("Ingrese el cuarto valor: ")
    val v4 = readln().toInt()

    val suma = v1 + v2
    println ( "\nLa suma de $v1 y $v2 es $suma" )

    val producto = v3 * v4
    println ( "El producto de $v3 y $v4 es $producto" )
}