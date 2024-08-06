import java.util.Scanner;
import java.util.Arrays;

public class Complementario11 {
    public static void main(String[] args) {
        Scanner consol = new Scanner(System.in);
        int[] array = {15,20,34,9,17,28};
        int length = array.length;
        for (int i = 0; i < length/2  ; i++) {
            int numero = array[i];
            array[i]=array[length-1-i];
            array[length-1-i]=numero;
        } 
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("El array es = "+Arrays.toString(array));
        consol.close();
    }
}
