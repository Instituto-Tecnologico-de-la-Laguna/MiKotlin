fun main(argumento: Array<String>) {
    // Le pedimos al usuario ingresar el primer valor.
    print("Ingrese primer valor:")
    val valor1 = readln().toInt()  // Lee el valor ingresado por el usuario, lo convierte a entero y lo asigna a valor1.

    // Le pedimos al usuario ingresar el segundo valor.
    print("Ingrese segundo valor:")
    val valor2 = readln().toInt()  // Lee el valor ingresado por el usuario, lo convierte a entero y lo asigna a valor2.

    // Le pedimos al usuario ingresar el tercer valor.
    print("Ingrese el tercer valor")
    val valor3 = readln().toInt()  // Lee el valor ingresado por el usuario, lo convierte a entero y lo asigna a valor3.

    // Le pedimos al usuario ingresar el cuarto valor.
    print("Ingrese el cuarto valor")
    val valor4 = readln().toInt()  // Corrige "valor" a "val" para que sea una variable de tipo entero en Kotlin.

    // Calcula la suma del valor1 y valor2.
    val suma = valor1 + valor2
    
    // Imprime el resultado de la suma.
    println("La suma de $valor1 y $valor2 es $suma")

    // Calcula el producto del valor 3 y valor 4.
    val producto = valor3 * valor4
    
    // Imprime el resultado del producto.
    println("El producto de $valor3 y $valor4 es $producto")
}
