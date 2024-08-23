//María Paula Rivera Pazos Ejercicio Quiz 22/08/24.
import java.util.Scanner;

public class Alcancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mon20 = 0, moncan20= 0;
        int mon50 = 0, moncan50= 0;
        int mon100= 0, moncan100 = 0;
        int mon200= 0, moncan200 = 0;
        int mon500= 0, moncan500 = 0;
        int total = (mon20+mon50+mon100+mon200+mon500);

        var menu = true;
        var agregar = false;
        while (menu){
            System.out.println("1. Agregar moneda");
            System.out.println("2. Contar monedas por denominacion");
            System.out.println("3. Calcular el total de dinero ahorrado");
            System.out.println("4. Vaciar alcancía");
            System.out.println("5. Salir");
            System.out.println("Digita la opción");
            int op = teclado.nextInt();



            if (op == 1){
                agregar = true;
                while (agregar){
                    System.out.println("1. Agregar moneda de 20");
                    System.out.println("2. Agregar moneda de 50");
                    System.out.println("3. Agregar moneda de 100");
                    System.out.println("4. Agregar moneda de 200");
                    System.out.println("5. Agregar moneda de 500");
                    System.out.println("6. Salir");
                    System.out.println("Digita la opción");
                    int agregarmoneda = teclado.nextInt();

                    if (agregarmoneda == 1){
                        moncan20++;
                        mon20 = mon20 + 20;
                        total = total + 20;
                    }else if (agregarmoneda==2){
                        moncan50++;
                        mon50 = mon50 + 50;
                        total = total + 50;
                    }else if (agregarmoneda==3){
                        moncan100++;
                        mon100 = mon100 + 100;
                        total = total + 100;
                    }else if(agregarmoneda == 4){
                        moncan200++;
                        mon200 = mon200 + 200;
                        total = total + 200;
                    }else if (agregarmoneda == 5){
                        moncan500++;
                        mon500 = mon500 + 500;
                        total = total + 500;
                    }else if (agregarmoneda <= 6){
                        agregar = false;
                    }
                }
            }else if (op==2){
                System.out.println("Tienes "+moncan20 + " monedas de 20: $"+mon20+" pesos");
                System.out.println("Tienes "+moncan50 + " monedas de 50: $"+mon20+" pesos");
                System.out.println("Tienes "+moncan100 + " monedas de 100: $"+mon100+" pesos");
                System.out.println("Tienes "+moncan200 + " monedas de 200: $"+mon200+" pesos");
                System.out.println("Tienes "+moncan500 + " monedas de 500: $"+mon500+" pesos");
            }else if (op==3){
                System.out.println("Tienes $"+total + " en total");
            }else if(op == 4){
                if (total >= 20){
                 mon20 = 0;
                 mon50 = 0;
                 mon100= 0;
                 mon200= 0;
                 mon500= 0;
                 total = (mon20+mon50+mon100+mon200+mon500);}
                else {
                    System.out.println("No hay fondos");
                }
            }else if (op > 5){
                 menu = false;
                 agregar = false;
            }
        }
    }

}
