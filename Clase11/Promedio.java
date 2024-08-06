import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        float[] array = {10.5f, 20.2f, 15.3f, 7.8f, 18.6f, 25.4f, 30.7f, 12.9f, 16.1f, 21.2f, 9.3f, 22.6f, 19.8f, 14.2f, 8.6f, 11.1f, 26.5f, 23.9f, 17.4f,24.0f};
        float suma = 0;
        for (float n : array) {
            suma += n;
        }
        float promedio = suma/array.length;
        System.out.println("La suma de todos los numeros es: "+suma);
        System.out.println("El promedio de todos los numeros es: "+promedio);
        consola.close();
    }
}
