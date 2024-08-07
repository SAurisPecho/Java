package Clase12;
import java.util.Scanner;

public class ContadorParImpar {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.println("Ingresar numeros enteros ");
            String resp = "si";
            int nump = 0;
            int numi = 0;
            while (resp.equals("si")) {
                System.out.println("Ingresar un numero entero: ");
                int num = consola.nextInt();
                if (num%2 == 0) {
                    nump++;
                } else {
                    numi++;
                }
                System.out.print("¿Desea ingresar otro numero? (si/no) ");
                resp = consola.next();
            }
            System.out.println("Hay "+nump+" numeros pares, entre todos numeros registrados.");
            System.out.println("Hay "+numi+" numeros impares, entre todos numeros registrados.");
        } catch(ArithmeticException e){
            System.out.println("Dato no valido.");
        } finally {
            consola.close();
        }
    }
}
