import kotlin.random.Random

fun main() {
    var moneda: Int
    var cara = 0
    var sello = 0
    var intentos = 0


    for (intentos in 1..20) {
        moneda = Random.nextInt(0, 2)
        if (moneda == 1) {
            println("Ha caído cara")
            cara++

        } else {
            println("Ha caído sello")
            sello++
        }

    }
    println("Cantidad de Sello $sello")
    println("Cantidad de Cara $cara")
}