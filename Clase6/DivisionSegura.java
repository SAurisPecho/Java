import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = consola.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = consola.nextInt();
        int resultado = 0;
        try {
            int operacion = num1 / num2;
            resultado = operacion;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
        }
        System.out.println("El resultado de la division es: "+resultado);
        consola.close();
    }
}