fun main() {
    println ( "Ingrese cuatro números:" )

    print ( "1: " )
    val n1 = readln().toInt()

    print ( "2: " )
    val n2 = readln().toInt()

    print ( "3: " )
    val n3 = readln().toInt()

    print ( "4: " )
    val n4 = readln().toInt()

    val suma = n1 + n2
    val prod = n3 * n4

    println ( "La suma de los números $n1 y $n2 es: $suma" )
    println ( "El producto de los números $n3 y $n4 es: $prod" )
}