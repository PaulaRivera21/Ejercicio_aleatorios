class Persona(val nombre: String, val edad: Int) {
    fun describir() {
        println("Me llamo $nombre y tengo $edad años.")
    }
}
fun main() {
    val persona = Persona("Juan", 30)
    persona.describir()
}
