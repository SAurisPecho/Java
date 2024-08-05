package Clase8;
import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese un numero a considerar el limite inferior: ");
            int inferior = consola.nextInt();
            System.out.print("Ingrese un numero a considerar el limite superior: ");
            int superior = consola.nextInt();
            System.out.println("El numero aleatorio es: "+(int)(Math.random()*(superior-inferior+1)+inferior));
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        
        consola.close();
    }
}
