fun main() {
    println("Hola mundo, Bienvenido a mi primer programa kotlin!!!") //MI HUMILDE CONTRIBUCION GIJON MORA JOSE EDUARDO

    do{
        var num1: Int
        var num2: Int

        println("Ingrese un numero: ")
        num1 = readln().toInt()

        println("Ingrese otro numero: ")
        num2 = readln().toInt();

        println("La suma de $num1 y $num2 es = ${num1+num2}")

        println("Pulsa enter para continuar...")

        readLine()

        println("Ingrese un numero: ")
        num1 = readln().toInt()

        println("Ingrese otro numero: ")
        num2 = readln().toInt()

        println("La multiplicacion entre $num1 y $num2 es = ${num1*num2}")

        println("Salir de la aplicacion? (S/N)")
        var opcion = readln()
    }while(opcion != "S")
}