import java.util.Scanner;

public class ConversionCadena {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese una cadena que represente un número entero: ");
        String resp = consola.next();
        try {
            int num = Integer.parseInt(resp);
            System.out.println("El numero entero representa: "+num);
        } catch (NumberFormatException e) {
            System.out.println("La cadena ingresada no representa un número entero válido.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
