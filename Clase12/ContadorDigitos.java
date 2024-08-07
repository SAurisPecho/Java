package Clase12;
import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try{
            System.out.print("Ingrese un numero entero: ");
            int numero = consola.nextInt();
            int digitos = 0;
            if (numero == 0) {
                digitos = 1;
            } else {
                if(numero < 0 ){
                    numero = -numero;
                }
                while (numero > 0) {
                    numero = numero / 10;
                    digitos++;
                }
            }
            
            System.out.println("El numero tiene "+digitos+" digitos.");
        } finally {
        consola.close();
        }
    }
}
