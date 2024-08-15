package Clase20;
import java.util.Scanner;

public class Calificación {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        do {
            System.out.println("Ingrese un número entre 0 y 100: ");
            num = consola.nextInt();
        } while (num < 0 || num > 100);

        String nota = obtenerNota(num);
        System.out.println("La calificación es: " + nota);
    }

    public static String obtenerNota (int numero ){
        return switch (numero/10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }
}
