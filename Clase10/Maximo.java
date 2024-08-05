package Clase10;
import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Escriba el primer numero: ");
        int primerNum = consola.nextInt();
        System.out.print("Escriba el segundo numero: ");
        int segundoNum = consola.nextInt();
        System.out.print("Escriba el tercer numero: ");
        int tercerNum = consola.nextInt();
        System.out.print("Escriba el cuarto numero: ");
        int cuartoNum = consola.nextInt();
        System.out.print("Escriba el quinto numero: ");
        int quintoNum = consola.nextInt();
        int[] array = new int[5];
        array[0] = primerNum;
        array[1] = segundoNum;
        array[2] = tercerNum;
        array[3] = cuartoNum;
        array[4] = quintoNum;
        int max = array[0];
        if (array[1] > max) {
            max = array[1];
        }
        if (array[2] > max) {
            max = array[2];
        }
        if (array[3] > max) {
            max = array[3];
        }
        if (array[4] > max) {
            max = array[4];
        }
        System.out.println("El numero mayor es: "+ max);
        consola.close();
    }
}
