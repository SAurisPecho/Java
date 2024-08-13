package Clase19;
import java.util.Scanner;

public class TablaMultiplicar2 {
    public static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = pedirNumeros();
        imprimirTablaMultiplicar(numeros);
    }
    public static int[] pedirNumeros() {
        int[] numeros = new int[3];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = consola.nextInt();
        }
        return numeros;
    }
    public static void imprimirTablaMultiplicar(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("Tabla del " + num[i]);
            System.out.println();
            for (int n = 1; n < 11; n++) {
                System.out.println(num[i]+" x "+n+" = "+num[i]*n);
            }
        System.out.println();
        }
    }
}
