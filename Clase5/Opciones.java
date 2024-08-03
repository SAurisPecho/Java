import java.util.Scanner;

public class Opciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un numero segun la opcion correspondiente a realizar:\nOpción 1: Guardar\nOpción 2: Cargar\nOpción 3: Salir");
        int opcionElegida = consola.nextInt();
        switch (opcionElegida) {
            case 1:
                System.out.println("A elegido la opcion Guardar");
                break;
            case 2:
                System.out.println("A elegido la opcion Cargar");
                break;
            case 3:
                System.out.println("A elegido la opcion Salir");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        consola.close();
    }
}
