package Clase19;

import java.util.Scanner;

public class TablaMultiplicar {
    public static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaMultiplicar(numero);
    }
    public static int pedirNumero() {
        System.out.print("Ingrese un numero: ");
        int numer = consola.nextInt();
        return numer;
    }
    public static void imprimirTablaMultiplicar(int num) {
        for (int i = 1; i < 11; i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }
}
