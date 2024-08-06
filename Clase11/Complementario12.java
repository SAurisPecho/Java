import java.util.Arrays;
import java.util.Scanner;

public class Complementario12 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = {20,22,30,32,40,42};
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i]+ array[i-1];
        }
        System.out.println(Arrays.toString(array));
        consola.close();
    }
}
