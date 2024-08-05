package Clase10;
import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        Scanner consola =  new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = consola.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = consola.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numero3 = consola.nextInt();
        System.out.print("Ingrese el cuarto número: ");
        int numero4 = consola.nextInt();
        System.out.print("Ingrese el quinto número: ");
        int numero5 = consola.nextInt();
        System.out.print("Ingrese el sexto número: ");
        int numero6 = consola.nextInt();
        int[] array = new int[6];
        array[0] = numero1;
        array[1] = numero2;
        array[2] = numero3;
        array[3] = numero4;
        array[4] = numero5;
        array[5] = numero6;

        int par = 0;

        if (array[0]%2==0){
            par++;
        }
        if (array[1]%2==0){
            par++;
        }
        if (array[2]%2==0){
            par++;
        }
        if (array[3]%2==0){
            par++;
        }
        if (array[4]%2==0){
            par++;
        }
        if (array[5]%2==0){
            par++;
        }
        
        System.out.println("El array tiene: "+par+" numeros pares");
        consola.close();
    }
}
