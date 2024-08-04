import java.util.InputMismatchException;
import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double resultado = 0;
        try {
            System.out.print("Ingrese el primer numero : ");
            double num1 = consola.nextDouble();
            System.out.print("Ingrese el segundo numero : ");
            double num2 = consola.nextDouble();
            double resta = num1 - num2;
            resultado = resta;
        } catch (InputMismatchException e) {
            System.out.println("Ingreso un caracter en lugar de un numero");
        } catch (Exception e) {
            System.out.println("Error!.");
           }
        System.out.println("El resultado de la resta es: "+resultado);

        consola.close();

    }
}
