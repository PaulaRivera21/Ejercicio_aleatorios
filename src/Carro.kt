//Constructor Primario
/*
class Carro(val marca: String, val modelo: String, val año: Int) {
    fun describir() {
        println("Este carro es un $marca $modelo del año $año.")
    }
}
fun main() {
    val miCarro = Carro("Toyota", "Corolla", 2020)

    miCarro.describir()
}
*/
//Constructor Secundario
class Carro(val marca: String, val modelo: String) {
    var año: Int = 0
    // Constructor secundario
    constructor(marca: String, modelo: String, año: Int) : this(marca, modelo) {
        this.año = año
    }
    fun describir() {
        println("Este carro es un $marca $modelo del año $año.")
    }
}
fun main() {
    val miCarro = Carro("Toyota", "Corolla", 2020)
    miCarro.describir()
}
