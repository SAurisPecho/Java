package Clase8;
import java.util.Scanner;

public class NumAleatorios {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            int numero = (int) (Math.random()*355)+1;
            // System.out.println(Math.floor(Math.random()*(355-1+1)+1));
            System.out.println("El numero aleatorio es: "+numero);
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        
        consola.close();
    }
}
