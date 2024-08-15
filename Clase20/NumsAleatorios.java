package Clase20;
import java.util.Scanner;

public class NumsAleatorios {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = numeroAleatorio();
        System.out.println("El numero es: "+numero);
        
    }
    public static int numeroAleatorio(){
        int num = (int) (Math.random()*355-1+1)+1;
        return num;
    }
}
