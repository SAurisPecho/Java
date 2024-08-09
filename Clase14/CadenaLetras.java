import java.util.Scanner;

public class CadenaLetras {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean soloCaracter = true;
        try {
            System.out.print("Introduzca una cadena: ");
            String cadena = consola.next();
            for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);
                if(!Character.isLetter(caracter)){
                    soloCaracter = false;
                }
            }
            if (soloCaracter) {
                System.out.println("La cadena solo tiene caracteres.");
            } else {
                System.out.println("La cadena no solo tiene caracteres.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
