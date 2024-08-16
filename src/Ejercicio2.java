import java.util.Random;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int dado1, dado2, pasadas=1, puntos1= 0, puntos2=0;

        do {
            dado1 = aleatorio.nextInt(6);
            dado2 = aleatorio.nextInt(6);
            if(dado1 < dado2){
                System.out.println("Dado 1 es: "+ dado1);
                System.out.println("Dado 2 es: "+ dado2);
                System.out.println("Gana dado 2");
                System.out.println("Puntos: " );
                System.out.println("Dado 1: " +puntos1);
                System.out.println("Dado 2: " +puntos2);
                puntos2++;
            } else if (dado1 > dado2) {
                System.out.println("Dado 1 es: "+ dado1);
                System.out.println("Dado 2 es: "+ dado2);
                System.out.println("Gana dado 1");
                System.out.println("Puntos: " );
                System.out.println("Dado 1: " +puntos1);
                System.out.println("Dado 2: " +puntos2);
                puntos1++;
            }else {
                System.out.println("Dado 1 es: "+ dado1);
                System.out.println("Dado 2 es: "+ dado2);
                System.out.println("Puntos: " );
                System.out.println("Dado 1: " +puntos1);
                System.out.println("Dado 2: " +puntos2);
                System.out.println("Empate");
            }
        }
        while (pasadas <=6);
        ;
    }
}
