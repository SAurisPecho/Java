import java.util.Scanner;

public class SumaNum {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Introduzca una cadena que represente un número entero: ");
            String numEntero = consola.nextLine();
            System.out.print("Introduzca una cadena que represente un número decimal: ");
            String numDec = consola.nextLine();
            int entero = Integer.valueOf(numEntero);
            double decimal = Double.valueOf(numDec);
            double suma = entero + decimal;
            System.out.println("La suma de ambos valores es: "+ suma);
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
