import java.util.Scanner;

public class ConversionCalificacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("ingresar una calificación numérica del 1 al 5: ");
        int respuesta = consola.nextInt();
        switch (respuesta) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("Numero no valido");
        }
        consola.close();
    }
}
