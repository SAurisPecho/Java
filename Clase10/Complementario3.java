package Clase10;
import java.util.Arrays;
import java.util.Scanner;

public class Complementario3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = consola.next();
        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = consola.next();
        System.out.print("Ingrese el tercer nombre: ");
        String nombre3 = consola.next();
        System.out.print("Ingrese el cuarto nombre: ");
        String nombre4 = consola.next();
        String[] nombres = new String[4];
        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        nombres[3] = nombre4;
        Arrays.sort(nombres);
        System.out.println("Nombres en orden alfabetico: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        consola.close();
    }
}
