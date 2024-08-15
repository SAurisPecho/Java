package Clase20;
import java.util.Scanner;

public class AdivinaNumero {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = obtenerNum();
        int num2 = obtenerNum();
        int resultado = numeroAleatorio(num1, num2);
        int adivinanza;
        do {
            System.out.println("Adivina el número entre " + num1 + " y " + num2 + ": ");
            adivinanza = consola.nextInt();
            if (adivinanza > resultado) {
                System.out.println("El número es menor. Intenta nuevamente.");
            } else if (adivinanza < resultado) {
                System.out.println("El número es mayor. Intenta nuevamente.");
            }
        } while (adivinanza != resultado);

        System.out.println("Has adivinado el número: " + resultado);
    }

    public static int obtenerNum () {
        System.out.println("Ingrese un numero: ");
        int num = consola.nextInt();
        return num;
    }

    public static int numeroAleatorio(int n1, int n2) {
        return (int)(Math.random()*(n2-n1+1)+n1);
    }
}
