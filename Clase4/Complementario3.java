package Clase4;

import java.util.Scanner;

public class Complementario3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = consola.nextInt();
        if (edad<18) {
            System.out.println("Eres menor de edad");
        } else if (edad > 18 && edad <= 64) {
            System.out.println("Eres adulto");
        } else if (edad >= 65 && edad <130 ) {
            System.out.println("Eres un adulto mayor");
        }
        consola.close();
    }
}
