package Clase19;
import java.util.Scanner;

public class ImprimirNombre {
    public static Scanner consola = new Scanner(System.in);
    public static void main(String[] args) { 
        String nombre = obtenerNombre();
        int edad = obtenerEdad();
        imprimeNombreYEdad(nombre,edad);
        consola.close();
    }
    public static String obtenerNombre () {
        System.out.println("Por favor ingrese un nombre:");
        String nombr = consola.nextLine();
        return nombr;
    }
    public static int obtenerEdad () {
        System.out.println("Por favor ingrese una edad:");
        int edad = consola.nextInt();
        return edad;
    }
    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " +nombre+ " y tengo "+edad+" años.");
    }
}

