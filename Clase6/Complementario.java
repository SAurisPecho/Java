import java.util.InputMismatchException;
import java.util.Scanner;

public class Complementario {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
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
        } catch (InputMismatchException e) {
            System.out.println("Ingreso un caracter en lugar de un numero!");
        } catch (Exception e ){
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}