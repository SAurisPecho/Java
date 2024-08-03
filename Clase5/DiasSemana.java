import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingres un numero en rango de 1 a 7: ");
        int numero = consola.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Seleccionaste el dia Lunes");
                break;
            case 2:
                System.out.println("Seleccionaste el dia Martes");
                break;
            case 3:
                System.out.println("Seleccionaste el dia Miercoles");
                break;
            case 4:
                System.out.println("Seleccionaste el dia Jueves");
                break;
            case 5:
                System.out.println("Seleccionaste el dia Viernes");
                break;
            case 6:
                System.out.println("Seleccionaste el dia Sabado");
                break;
            case 7:
                System.out.println("Seleccionaste el dia Domingo");
                break;
            default:
                System.out.println("No es un valor valido");
                break;
        }
        consola.close();
    }
}
