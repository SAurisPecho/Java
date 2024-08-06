import java.util.Scanner;

public class ContandoPares {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int par = 0;
        for (int i = 0; i < array.length; i++)  {
            if (array[i] % 2 == 0){
                par++;
            }
        }
        System.out.println("En el array hay: "+par+" numeros pares.");
        consola.close();
    }
}
