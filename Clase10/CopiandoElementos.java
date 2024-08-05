package Clase10;
import java.util.Scanner;

public class CopiandoElementos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = {1,2,3};
        int[] nuevoArray = new int[array.length+2];
        nuevoArray[0] = array[0] ;
        nuevoArray[1] = array[1] ;
        nuevoArray[2] = array[2] ;
        System.out.print("Ingrese el primer numero para agregar al array: ");
        int primerNum = consola.nextInt();
        System.out.print("Ingrese el segundo numero para agregar al array: ");
        int segundoNum = consola.nextInt();
        nuevoArray[3] = primerNum;
        nuevoArray[4] = segundoNum;

        System.out.print("El nuevo array esta conformado por: ");
        System.out.print(nuevoArray[0]);
        System.out.print(nuevoArray[1]);
        System.out.print(nuevoArray[2]);
        System.out.print(nuevoArray[3]);
        System.out.print(nuevoArray[4]);
        consola.close();
    }
}
