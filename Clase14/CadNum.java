import java.util.Scanner;

public class CadNum {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Introduzca una cadena: ");
            String cad = consola.next();
            double num = Double.valueOf(cad);
            System.out.println("este es: "+num);
        } catch (NumberFormatException e) {
            String mensaje = e.getMessage();
            System.out.println(mensaje);
            System.out.println("La entrada no es valida.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } finally {
            consola.close();
        }

    }
}
