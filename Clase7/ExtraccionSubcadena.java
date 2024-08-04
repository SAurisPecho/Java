package Clase7;
import java.util.Scanner;

public class ExtraccionSubcadena {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase = consola.nextLine();
        System.out.print("Escriba el primer numero entero del indice inicial: ");
        int num1 = consola.nextInt();
        System.out.print("Escriba el segundo numero entero del indice final: ");
        int num2 = consola.nextInt();
        String subCadena = frase.substring(num1, num2);
        System.out.println("La subcadena es: "+subCadena);
        consola.close();
    }
}
