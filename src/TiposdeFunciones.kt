// Funcion estandar
/*
fun mostrarMensajeCorto(mensaje: String) {
    println(mensaje)
}
fun main() {
    mostrarMensajeCorto("Hola Mundo!")
}
 */
/* fun suma(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    print("El resultado de la suma es:")
    println(suma(3, 5))
}
*/
//Funciones de extensión
/*fun String.reversa(): String {
    return this.reversed()
}

fun main() {
    val texto = "Hola"
    println(texto.reversa())
}
*/
//Funciones de orden superior
/*fun aplicarOperacion(num: Int, operacion: (Int) -> Int): Int {
    return operacion(num)
}

fun main() {
    val resultado = aplicarOperacion(5) { it * 2 }

    println("Resultado: $resultado")
}
*/
//Funciones lamda
/*
val multiplicar: (Int, Int) -> Int = { x, y -> x * y }

fun main() {
    println(multiplicar(3, 7))
}
*/
//Funciones Inline
/*inline fun ejecutarOperacion(operacion: () -> Unit) {
    println("Antes de ejecutar la operación")
    operacion()
    println("Después de ejecutar la operación")
}

fun main() {
    ejecutarOperacion { println("Operación ejecutada") }
}
*/
//Funciones de un solo uso
fun sumar(a: Int, b: Int) = a + b
fun main() {
    println(sumar(1,4))
}


