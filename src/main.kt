fun main() {
    print("Ingrese el primer valor entero: ");
    val val1 = readln().toInt(); //Se lee la linea del cuarto valor convirtiendo la entrada a entero

    print("Ingrese el segundo valor entero: ");
    val val2 = readln().toInt(); //Se lee la linea del cuarto valor convirtiendo la entrada a entero

    print("Ingrese el tercer valor entero: ");
    val val3 = readln().toInt(); //Se lee la linea del cuarto valor convirtiendo la entrada a entero

    print("Ingrese el cuarto valor entero: ");
    val val4 = readln().toInt(); //Se lee la linea del cuarto valor convirtiendo la entrada a entero

    val suma = val1 + val2; //Se suma el valor 1 y el valor 2 y se le asigna a la variable suma
    val produ = val3 * val4; //Se multiplica el valor 3 y el valor 4 asignandola a la variable produ

    println(); //Se hace un salto de linea para dejar un espacio

    println("La suma de $val1 y $val2 es $suma"); //Se imprimen los valores 1 y 2 ademas de la suma resultante
    println("El producto de $val3 y $val4 es $produ"); //Se imprimen los valores 3 y 4 ademas del producto resultante
}