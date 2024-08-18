package Clase22;
import java.util.Scanner;

public class DepurarCalculadora {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        int resultado = 0;

        do {
            opcion = menu();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                return;
            } else if (opcion <1 || opcion > 4) {
                System.out.println("Opción de operación no válida");
                continue;
            }

            int num1 = obtenerNum();
            int num2 = obtenerNum();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado es: "+resultado);
                    break;
                case 4:
                    try {
                        if (num2 > -1) {
                        resultado = num1 / num2;
                        System.out.println("El resultado es: "+resultado);
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println("Ocurrio un error!");
                    }
                    
                }
        } while (opcion != 0);
    }

    public static int menu() {
        System.out.println("Calculadora\n1 .Sumar\n2 .Restar\n3 .Multiplicar\n4 .Dividir\n0 .Salir ");
        System.out.print("Ingrese el numero de la opcion de calculo a realizar: ");
        int opcion = consola.nextInt();
        return opcion;
    }

    public static int obtenerNum () {
        System.out.print("Ingrese un numero: ");
        int num = consola.nextInt();
        return num;
    }
}
