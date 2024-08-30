fun main() {


   /* Practica 1
    Requisitos de finalización
    Descargar el siguiente repositorio en su IntelliJ
    https://github.com/Instituto-Tecnologico-de-la-Laguna/MiKotlin.git
    Crear 1 programa básico en una nueva rama del repositorio, la rama debera nombrarse como: Pr1<Control> y realizar lo siguiente:
    Modificar el  programa en el cual se ingresen cuatro números enteros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto
    Una vez terminado deberán comentar el programa  y realizar el Push correspondiente, crear un Pull Request y asignar como revisor a jmot4 y asinarse el programa ustedes mismos.
    Asegurarse de haber enviado el Pull Request en la pagina de GitHub.
    */

    val RED = "\u001B[31m"
    val GREEN = "\u001B[32m"
    val RESET = "\u001B[0m"

    println("${RED}Hello, World desde Kotlin. Soy un programa muy bien educado y tedioso =)${RESET}") //Alejandro_Martínez

    println("Ingresa el primer número, por favor: ")
        val numero1 = readLine()!!.toInt()
        println("Gracias =)")

    println("Ingresa el segundo número, por favor: ")
        val numero2 = readLine()!!.toInt()
        println("Gracias =)")

    println("Ingresa el tercer número:")
        val numero3 = readLine()!!.toInt()
        println("Gracias =)")

    println("Ingresa el cuarto número:")
        val numero4 = readLine()!!.toInt()
        println("Gracias =)")

    // Calcular la suma de los dos primeros números
        val suma = numero1 + numero2

    // Calcular el producto del tercer y cuarto número
        val multi = numero3 * numero4

        // Informar los resultados
        println("${GREEN}La suma de los dos primeros números es: $suma${RESET}")
        println("${RED}El producto del tercer y cuarto número es: $multi${RESET}")

        println("HASTA LUEGO. ¡VUELVA PRONTO! =)")
    }