package Clase4;

import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = consola.nextInt();
        if(numero%3 == 0 && numero%5 == 0){
            System.out.println("El numero es divisibles por 3 y 5");
        } else if (numero%3 == 0) {
            System.out.println("El numero es divisibles por 3 ");
        } else if (numero%5 == 0) {
            System.out.println("El numero es divisibles por 5 ");
        } else {
            System.out.println("El numero no es divisibles ni por 3, ni por 5 ");
        }
        consola.close();
    }
}
