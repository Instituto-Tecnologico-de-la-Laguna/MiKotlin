fun main() {

    println("Ingresa el primer numero:")
    val num1 = readln().toInt()
    println("Ingrese el segundo numero:")
    val num2 = readln().toInt()
    println("Ingrese el tercer numero:")
    val num3 = readln().toInt()
    println("Ingrese el cuarto numero:")
    val num4 = readln().toInt()

    val suma = num1 + num2
    val producto = num3*num4

    println("La suma de los primeros numeros es $suma")
    println("El producto de los ultimos numeros es $producto")
}