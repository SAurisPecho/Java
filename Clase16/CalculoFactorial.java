package Clase16;
import java.util.Scanner;
import java.util.ArrayList;

public class CalculoFactorial {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número para calcular su factorial: ");
            int num = consola.nextInt();
            ArrayList<Integer> numeros = new ArrayList<>();
    
            for (int i = 1; i <= num; i++) {
                numeros.add(i);
            }

            int resultado = numeros.get(0); // Inicializa resultado con el valor del primer número de la lista 
            int i = 1;
            do {
                resultado *=  numeros.get(i);  //Multiplica el valor actual de resultado por el siguiente número en la lista
                i++;
            } while (i < numeros.size());

            System.out.println("Los numeros a multiplicar son: "+numeros);
            System.out.println("El resultado del factorial es: "+resultado);

        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
