package Clase8;
import java.util.Scanner;

public class Redondeo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número decimal: ");
            double decimal = consola.nextDouble();
            System.out.println("El valor del numero redondeando seria: "+Math.round(decimal));
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
