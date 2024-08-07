package Clase12;
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try{
            while (true) {
            System.out.print("Ingrese un numero entero: ");
            int numero = consola.nextInt();
                if(numero <= 0){
                    System.out.println("No es posible multiplicar.");
                    System.out.println("Saliendo...");
                    break;
                } else {
                    for (int i = 1; i < 13; i++) {
                        System.out.println(numero+" x "+i+" = "+numero*i);
                    }
                }
            }
        } finally {
            consola.close();
        }
    }
}
