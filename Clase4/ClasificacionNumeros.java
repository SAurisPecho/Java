package Clase4;

import java.util.Scanner;

    // ✏️  Actividad: Clasificación de Números
    // En esta actividad, deberás escribir un programa que solicite al usuario un número y determine si es positivo,
    //  negativo o cero. El resultado se mostrará en pantalla.

public class ClasificacionNumeros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double numero;
        System.out.print("Ingrese un numero: ");
        numero = consola.nextDouble();
        boolean positivo = (numero > 0);
        boolean negativo = (numero < 0);
        if (positivo){
            System.out.println("El numero es positivo");
        } else if (negativo){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
        consola.close();
    }

}