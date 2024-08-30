fun main() {
    //aqui iniciamos el programa
    println("Suma de 2 numeros enteros ;) ")
    //imprimimos un mensaje que nos diga para ingresar el valor
    print("Digite el primero valor:")
    //inicializamos la primer variable que se usa para que se guarde en esta
    //lo que el usuario digite
    //readln hace que entre
    val PrimValor = readln().toInt()
    print("Digite el segundo valor:")
    //aqui hacemos lo mismo inicializamos la segunda variable de entrada,
    val SegunValor = readln().toInt()
    //
    val suma = PrimValor + SegunValor
    println("La suma correspondiente es: $PrimValor y $SegunValor es $suma")

    println("Multiplicacion de 2 numeros enteros :) ")
    print("Digite el primero valor:")
    val PrimValorMul = readln().toInt()
    print("Digite el segundo valor:")
    val SegunValorMul = readln().toInt()

    val multiplicacion = PrimValorMul * SegunValorMul
    println("La suma correspondiente es: $PrimValorMul y $SegunValorMul es $multiplicacion")
}