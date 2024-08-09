import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int digito = 0;
        try {
            System.out.print("Introduzca un número: ");
            int num = consola.nextInt();
            String numCad = String.valueOf(num);
            for (int i = 0; i < numCad.length(); i++) {
                char caracter = numCad.charAt(i);
                if (Character.isDigit(caracter)) {
                    digito++;
                }
            }
            System.out.println("En la cadena hay: "+digito+" digitos.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
