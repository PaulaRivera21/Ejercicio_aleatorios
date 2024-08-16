import kotlin.random.Random
fun main() {
    var edad: Int
        edad = Random.nextInt(0,93)
            println("Su edad es: ${edad}")
    if (edad<= 10){
        println("Perteneces a la Generación T")
    }else if (edad >= 11 && edad<=27){
        println("Perteneces a la Generación Z")
    }else if (edad >= 28 && edad<=40){
        println("Perteneces a la Generación Y")
    }else if (edad >= 41 && edad<=52){
        println("Perteneces a la Generación X")
    }else if (edad >= 53 && edad<=72){
        println("Perteneces a la Generación Baby Boomers")
    }else {
            println("Perteneces a la Generación Silenciosa")
        }
    }

