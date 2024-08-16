import java.util.Random;
import java.util.Scanner;

public class EJERCICIOs {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int n, a, intentos=1;
        a = aleatorio.nextInt(51);
        while (intentos <= 3){
            System.out.println("Digite un número:");
            n = teclado.nextInt();

            if (n>a){
                System.out.println("El numero es menor");
            } else if (n<a) {
                System.out.println("El numero es mayor");
            } else if (n == a) {
                System.out.println("Ganaste");
                break;
            }
            intentos++;
        }
        System.out.println("El número era: " + a);
    }
}
