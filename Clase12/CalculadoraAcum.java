package Clase12;
import java.util.Scanner;

public class CalculadoraAcum {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try{
            System.out.println("Sumar numeros: ");
            int acum = 0;
            String resp = "si"; 
            do {
                System.out.println("Ingresar un numero entero: ");
                int num = consola.nextInt();
                if (num < 0) {
                    System.out.println("Error: el numero ingresado es negativo.");
                    System.out.print("¿Desea ingresar otro numero? (si/no)");
                    resp = consola.next();
                } else {
                    acum += num;
                    System.out.print("¿Desea ingresar otro numero? (si/no)");
                    resp = consola.next();
                }
            } while (resp.equals("si"));
            System.out.println("La suma acumulada de todos los digitos registrados es: "+acum);
        } catch (ArithmeticException e) {
            System.out.println("Dato no valido.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } finally {
            consola.close();
        }
    }
}
