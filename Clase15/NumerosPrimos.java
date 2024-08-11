package Clase15;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.println("Numero primo:");
            int numero;
            
            do {
                System.out.println("Ingrese un número que desee verificar (0 para salir): ");
                numero = consola.nextInt();
                if (numero == 0) {
                    break;
                } if (numero < 2) {
                    System.out.println("El número no es primo.");
                    continue;
                }
                boolean esPrimo = true;
                for (int i = 2; i <= numero/2; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    System.out.println("El número es primo.");
                } else {
                    System.out.println("El número no es primo.");
                }
            } while (numero != 0);
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
