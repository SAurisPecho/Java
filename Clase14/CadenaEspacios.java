import java.util.Scanner;

public class CadenaEspacios {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int espacios = 0;
        try {
            System.out.print("Introduzca una cadena: ");
            String cadena = consola.nextLine();
            for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);
                if (Character.isWhitespace(caracter)) {
                    espacios++;
                }
            }
            System.out.println("En la cadena hay "+espacios+" espacios.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
