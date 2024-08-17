import java.util.Scanner;

public class FactorialRecursividad {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese un número para calcular su factorial: ");
        int num = consola.nextInt();

        int resultado = factorial(num);

        System.out.println("El resultado del factorial es: "+resultado);
    }

    public static int factorial (int num) {
        if (num == 1 ) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
}
