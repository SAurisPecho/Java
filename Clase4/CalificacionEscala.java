package Clase4;

import java.util.Scanner;

public class CalificacionEscala {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Porfavor ingrese un numero de 0 - 100: ");
        int numero = consola.nextInt();
        boolean verificacion = numero >= 0 && numero <= 100;
        if (verificacion) {
            if (numero >= 90 && numero <= 100) {
                System.out.println("La calificación es: A");
            } else if (numero >= 80 && numero <= 89) {
                System.out.println("La calificación es: B");
            } else if (numero >= 70 && numero <= 79) {
                System.out.println("La calificación es: C");
            } else if (numero >= 60 && numero <= 69) {
                System.out.println("La calificación es: D");
            } else {
                System.out.println("La calificación es: F");
            }
        } else {
            System.out.println("El número ingresado está fuera del rango válido");
        }
        consola.close();
    }
}
