import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Selecciona una opcion:\n1-Lunes\n2-Martes\n3-Miercoles\n4-Jueves\n5-Viernes\n6-Sabado\n7-Domingo\ningresar un número del 1 al 7:");
        int opcionDia = consola.nextInt();
        switch (opcionDia) {
            case 1,2,3,4,5 -> System.out.println("Es un dia hábil");
            case 6,7 -> System.out.println("No es un dia hábil");
            default -> System.out.println("Opcion no valida");
        }
        consola.close();
    }
}