package Clase12;
import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            int opcion;
            while (true) {
            System.out.println("Menú Interactivo: \n 1 - Comprar producto. \n 2 - Realizar devolución. \n 3 - Ver mis pedidos. \n 4 - Preguntas frecuentes. \n 5 - Salir. ");
            System.out.print("Elija el numero de la opcion que prefiera: ");
            opcion = consola.nextInt();
            consola.nextLine();
                switch(opcion){
                    case 1 :
                        System.out.println("Eligio la opcion: Comprar producto");
                        break;
                    case 2 :
                        System.out.println("Eligio la opcion: Realizar devolución");
                        break;
                    case 3 :
                        System.out.println("Eligio la opcion: Ver mis pedidos");
                        break;
                    case 4 :
                        System.out.println("Eligio la opcion: Preguntas frecuentes");
                        break;
                    case 5 : 
                            System.out.println("Eligio la opcion: Salir.");
                            System.out.println("Saliendo...");
                            return;
                    default :
                            System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                            break;
                }    
            }        
        } finally {
            consola.close();
        }
    }
}