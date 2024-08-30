/*
Hecho por: Edgar Manuel Carrillo Muruato

:D
 */

fun main() {
    println( "PROGRAMA SIMPLE\n" )

    do{
        // Menu de opciones
        println( "Menu" )
        println( "------------------" )
        println( "1. Suma de dos numeros." )
        println( "2. Producto de dos numeros." )
        println( "3. Salir.\n" )

        println( "Selecciona una acción" )
        val opc = readln().first();

        when( opc ){
            '1' -> { // Operación de suma
                println("Ingresa el primer numero:")
                val num_1 = readln().toInt()

                println("Ingresa el segundo numero:")
                val num_2 = readln().toInt()

                val suma = num_1 + num_2
                println( "La suma de $num_1 y $num_2 es: $suma.\n" )
            }

            '2' -> { // Operación de multiplicación
                println("Ingresa el primer numero:")
                val num_1 = readln().toInt()

                println("Ingresa el segundo numero:")
                val num_2 = readln().toInt()

                val producto = num_1 * num_2
                println( "El producto de $num_1 y $num_2 es: $producto.\n" )
            }

            '3' -> { // Salida del programa
                println( "Bye bye :D" )
            }

            else -> { // En caso de que un valor u opción que no se acepta
                println( "No seleccionaste una opción válida.\n" )
            }
        }

    }while( opc != '3' )
}