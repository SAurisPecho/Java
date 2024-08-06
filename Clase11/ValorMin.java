import java.util.Scanner;

public class ValorMin {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[] array = {21,7,8,15,22,11};
        int minimo = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo){
                minimo = array[i];
            }
        }
        System.out.println("El valor minimo es: "+minimo);
        consola.close();
    }
}
