import java.sql.SQLOutput
import kotlin.math.pow

fun main() {
    var altura:Double
    var peso:Int
    var imc:Double

    println("Digite su altura en cm:")
    altura = readln().toDouble()
    println("Digite su peso en kg:")
    peso = readln().toInt()

    imc = (peso/(Math.pow(altura.toDouble(), 2.0)))


    println("Tu IMC es: ${imc}")

    if (imc< 18.5){
        println("Tienes bajo peso")
    }else if (imc >= 18.5 && imc<=24.9){
        println("Tienes Normopeso")
    }else if (imc >= 25 && imc<=26.9){
        println("Tienes Sobrepeso Grado I")
    }else if (imc >= 27 && imc<=29.9){
        println("Tienes Sobrepeso Grado II")
    }else if (imc >= 30 && imc<=34.9){
        println("Tienes Obesidad de tipo I")
    }else if (imc >= 35 && imc<=39.9){
        println("Tienes Obesidad de tipo II")
    }else if (imc >= 40 && imc<=49.9){
        println("Tienes Obesidad de tipo III (mórbida)")
    }else {
        println("Tienes Obesidad de tipo IV (extrema)")
    }
}
