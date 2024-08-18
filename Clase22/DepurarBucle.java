package Clase22;
import java.util.Scanner;
import java.util.Arrays;

public class DepurarBucle {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("¿Cuantos numeros desea ingresar? ");
            int num = consola.nextInt();
            int[] numeros = new int[num];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int)(Math.random()*num);
            }
            
            int resultado = 0;
            for (int i = 0; i < numeros.length; i++) {
                resultado += numeros[i];
            }

            System.out.println(Arrays.toString(numeros));
            System.out.println("La suma de todos los numeros es: "+resultado);

        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
    }
}
