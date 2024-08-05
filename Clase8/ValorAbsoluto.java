package Clase8;
import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            int numero = consola.nextInt();
            System.out.println("El valor absoluto es: "+Math.abs(numero));
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }   
        consola.close();
    }
}
