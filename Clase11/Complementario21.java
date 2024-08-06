import java.util.Scanner;

public class Complementario21 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String frase = "aprendiendo java para mejorar habilidades en programación";
        System.out.println("La frase es: "+frase);
        char[] array = new char[50];
        int chr = 0;
        for (int letra : array) {
            if (chr < frase.length()) {
                array[chr] = frase.charAt(chr);
            } 
            chr++;
        }
        System.out.println("Ingrese un caracter de la frase: ");
        char caracter = consola.next().charAt(0);
        int contador = 0;
        for (char l : array) {
            if (l == caracter ) {
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("El carácter "+caracter+" no aparece en la frase.");
        } else {
            System.out.println("El carácter "+caracter+" aparece "+contador+" veces.");
        }
        consola.close();
    }
}
