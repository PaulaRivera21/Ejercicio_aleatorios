data class PersonaD (val nombre: String, val edad: Int)
fun main() {
    val persona1 = PersonaD("Carlos", 25)
    println(persona1)

    val persona2 = persona1.copy(edad = 26)
    println(persona2)

    println(persona1 == persona2)

    println("Nombre: ${persona1.nombre}")
    println("Edad: ${persona1.edad}")

    val (nombre, edad) = persona1
    println("Nombre desestructurado: $nombre")
    println("Edad desestructurada: $edad")
}
