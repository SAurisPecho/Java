package Clase8;
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Escriba la base de la potencia a realizar: ");
            double base = consola.nextDouble();
            System.out.print("Escriba el exponente de la potencia a realizar: ");
            double exponente = consola.nextDouble();
            System.out.println("El resultado de elevar "+base+" a la potencia "+exponente+" es: "+Math.pow(base, exponente));
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
