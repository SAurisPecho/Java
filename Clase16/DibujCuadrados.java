package Clase16;
import java.util.Scanner;

public class DibujCuadrados {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Introduce el tamaño del cuadrado (N): ");
            int num = consola.nextInt();
            if (num <= 0) {
                System.out.println("El tamaño del cuadrado debe ser un número positivo.");
                return;
                }
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i == 0 || i == num - 1 || j == 0 || j ==  num - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } finally {
            consola.close();
        }
    }
}
