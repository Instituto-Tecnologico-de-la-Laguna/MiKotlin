fun main() {
    //Desarrollado por Victor Tijerina
    println("Bienvenido a la practica 1: ")
    println("Inserte el primer valor: ")
    val number1 = readln().toInt()

    println("Inserte el segundo valor: ")
    val number2 = readln().toInt()

    println("Inserte el tecer valor: ")
    val number3 = readln().toInt()

    println("Inserte el cuarto valor: ")
    val number4 = readln().toInt()

    println("La suma del numero 1 y el numero 2 es: ${
        number1+number2
    }"
    )

    println("El producto del numero 3 y el numero 4 es: ${
        number3*number4
    }"
    )
}