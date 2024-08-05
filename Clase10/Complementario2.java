package Clase10;
import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = consola.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = consola.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numero3 = consola.nextInt();
        System.out.print("Ingrese el cuarto número: ");
        int numero4 = consola.nextInt();
        System.out.print("Ingrese el quinto número: ");
        int numero5 = consola.nextInt();
        int[] array = new int[5];
        array[0] = numero1;
        array[1] = numero2;
        array[2] = numero3;
        array[3] = numero4;
        array[4] = numero5;
        int suma = array[0]+array[2]+array[4];
        System.out.println("El resultado de la suma de las posiciones pares en el array es: "+suma);
        consola.close();
    }
}
