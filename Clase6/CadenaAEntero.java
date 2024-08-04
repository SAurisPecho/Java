import java.util.Scanner;

public class CadenaAEntero {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres que represente un número entero: ");
        String respuesta = consola.next();
        try {
            int numero = Integer.parseInt(respuesta);
            System.out.print("El numero es : "+numero);
        } catch (NumberFormatException e) {
            System.out.println("La cadena ingresada no es posible convertir a texto");
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
