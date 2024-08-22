//Listas inmutables
/*
fun main() {
    val listaDeEnteros = listOf(1, 2, 3, 4, 5)
    val listaDeCadenas = listOf("uno", "dos", "tres")

    println(listaDeEnteros)
    println(listaDeCadenas)
}
*/
//Listas Mutables
/*
fun main() {
    val listaMutableDeEnteros = mutableListOf(1, 2, 3)
    listaMutableDeEnteros.add(4)
    listaMutableDeEnteros.remove(2)
    println(listaMutableDeEnteros)

    val listaMutableDeCadenas = mutableListOf("uno", "dos")
    listaMutableDeCadenas.add("tres")
    println(listaMutableDeCadenas)
}
*/
//Listas de varios tipos de datos con Any
/*
fun main() {
    val listaMixta: List<Any> = listOf(1, "Maria", 1.72, true)

    for (elemento in listaMixta) {
        println("ID: $elemento, Tipo: ${elemento::class.simpleName}")
    }
}
*/

/*
//Lista Mutable con Varios Tipos
fun main() {
    val listaMutableMixta: MutableList<Any> = mutableListOf(1, "dos", 3.0)
    listaMutableMixta.add(true)
    listaMutableMixta.remove("dos")8

    // Mostrar los elementos
    for (elemento in listaMutableMixta) {
        println("Elemento: $elemento, Tipo: ${elemento::class.simpleName}")
    }
}
*/
//Lista con diferente dato que tiene coherencia
fun main() {
    val listaMixta: List<Any> = listOf(1, "Maria", 1.72, false)

    if (listaMixta.size == 4) {
        val id = listaMixta[0] as Int
        val nombre = listaMixta[1] as String
        val altura = listaMixta[2] as Double
        val sobrepeso = listaMixta[3] as Boolean

        println("ID:$id, Nombre:$nombre, Altura:$altura; sobrepeso:$sobrepeso")
    } else {
        println("La lista no contiene el número esperado de elementos.")
    }
}
