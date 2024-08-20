import java.util.Random;
public class Ejercicio2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int dado1, dado2, intento, puntos1= 0, puntos2=0;

        for (intento = 1; intento<7; intento++){
            dado1 = aleatorio.nextInt(6);
            dado2 = aleatorio.nextInt(6);
            if(dado1 < dado2){
                System.out.println("Dado 1 es: "+ dado1);
                System.out.println("Dado 2 es: "+ dado2);
                System.out.println("Gana dado 2");
                puntos2++;
                System.out.println("Puntos: " );
                System.out.println("Dado 1: " +puntos1);
                System.out.println("Dado 2: " +puntos2);
            } else if (dado1 > dado2) {
                System.out.println("Dado 1 es: "+ dado1);
                System.out.println("Dado 2 es: "+ dado2);
                System.out.println("Gana dado 1");
                puntos1++;
                System.out.println("Puntos: " );
                System.out.println("Dado 1: " +puntos1);
                System.out.println("Dado 2: " +puntos2);

            }else {
                System.out.println("Dado 1 es: "+ dado1);
                System.out.println("Dado 2 es: "+ dado2);
                System.out.println("Puntos: " );
                System.out.println("Dado 1: " +puntos1);
                System.out.println("Dado 2: " +puntos2);
                System.out.println("Empate");
            }
            System.out.println();
        }
    }
}
