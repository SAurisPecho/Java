package Clase12;
import java.util.Scanner;

public class AdivinandoNumero {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numAleatorio = (int) (Math.random()*20)+1;
        int numeroElegido;
        do {
            System.out.print("Adivina que numero es, un numero de 1 a 20: ");
            numeroElegido = consola.nextInt();
            if (numAleatorio == numeroElegido) {
            System.out.println("¡Si adivinaste es: "+numeroElegido+" !");
            } else {
                if (numeroElegido < numAleatorio) {
                    System.out.println("El numero es mayor que: "+numeroElegido);
                } else {
                    System.out.println("El numero es menor que: "+numeroElegido);
                }
            }
        } while (numAleatorio != numeroElegido);
        consola.close();
    }
}
