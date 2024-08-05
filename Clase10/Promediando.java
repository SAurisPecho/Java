package Clase10;
import java.util.Scanner;

public class Promediando {
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
        int[] array = new int[4];
        array[0] = primerNum;
        array[1] = segundoNum;
        array[2] = tercerNum;
        array[3] = cuartoNum;
        int suma = array[0]+array[1]+array[2]+array[3];
        double promedio = (double) suma/4;
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los cuatro numeros es: "+promedio);
        consola.close();
    }
}
