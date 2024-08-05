package Clase8;
import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese un numero positivo: ");
            double numero = consola.nextDouble();
            if (numero < 0 ) {
                System.out.println("El numero ingresado es negativo. No es posible realizar la operacion");
            } else {
                System.out.println("La raiz cuadrada de "+numero+" es: "+Math.sqrt(numero));
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
       
        consola.close();
    }
}
