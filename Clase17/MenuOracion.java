package Clase17;
import java.util.Arrays;
import java.util.Scanner;

public class MenuOracion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            int opcion;
            System.out.println("Ingrese una oración: ");
            String sentencia = consola.nextLine();

            while (true) {
                System.out.println("Menú Interactivo: \n 1 - Crear oración o Borrar oración. \n 2 - Cantidad de caracteres de la oración. \n 3 - Cantidad de palabras de la oración. \n 4 - Mostrar palabras ordenadas alfabéticamente. \n 5 - Ingresar un número y devolver la palabra correspondiente. \n 6 - Buscar palabra dentro de la oración. \n 7 - Modificar palabra dentro de la oración. \n 8 - Agregar contenido a la oración. \n 9 - Salir. ");
                System.out.print("Elija el numero de la opcion que prefiera: ");
                opcion = consola.nextInt();
                consola.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.print("Crear nueva oración(1)\nBorrar oración(2)\n");
                        int minOpcion = consola.nextInt();
                            if (minOpcion == 1) {
                                System.out.println("Ingrese una oración: ");
                                String nueva = consola.next();
                                sentencia = nueva;
                            } else if (minOpcion == 2 ) {
                                sentencia = "";
                            }
                        break;
                    case 2:
                        System.out.println("Cantidad de caracteres de la oración");
                        System.out.println("La oración tiene " + sentencia.length() + " caracteres.");
                        break;
                    case 3:
                        System.out.println("Cantidad de palabras de la oración");
                        String[] palabras = sentencia.split("\\s+");
                        int cantidadPalabras = palabras.length;
                        System.out.println("La cantidad de palabras en la oración es: " + cantidadPalabras);
                        break;
                    case 4:
                        System.out.println("Mostrar palabras ordenadas alfabéticamente");
                        String[] todas = sentencia.split("\\s+");
                        Arrays.sort(todas);
                        System.out.println("Palabras ordenadas alfabéticamente: " + Arrays.toString(todas));
                        break;
                    case 5:
                        System.out.println("Ingresar un número y devolver la palabra correspondiente");
                        String[] tod = sentencia.split("\\s+");
                        System.out.print("Ingrese un número: ");
                        int numero = consola.nextInt();
                        consola.nextLine();
                        if (numero > 0 && numero <= tod.length) {
                            System.out.println("La palabra en la posición " + numero + " es: " + tod[numero - 1]);
                        } else {
                            System.out.println("Número inválido. Intente nuevamente.");
                        }
                        break;
                    case 6:
                        System.out.println("Buscar palabra dentro de la oración");
                        System.out.print("Ingrese una palabra para buscar: ");
                        String palabraBuscada = consola.next();
                        String[] palabrs = sentencia.split("\\s+");
                        boolean encontrado = false;
                        for (int i = 0; i < palabrs.length; i++) {
                            if (palabrs[i].equals(palabraBuscada)) {
                                System.out.println("La palabra \"" + palabraBuscada + "\" fue encontrada en la posición " + (i + 1) + ".");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("La palabra \"" + palabraBuscada + "\" no fue encontrada en la oración.");
                        }
                        break;
                    case 7:
                        System.out.println("Modificar palabra dentro de la oración");
                        System.out.print("Ingrese la palabra que desea modificar: ");
                        String antiguaPalabra = consola.nextLine();
                        System.out.print("Ingrese la nueva palabra: ");
                        String nuevaPalabra = consola.nextLine();
                        sentencia = sentencia.replace(antiguaPalabra, nuevaPalabra);
                        System.out.println("La oración modificada es: " + sentencia);
                        break;
                    case 8:
                        System.out.println("Agregar contenido a la oración");
                        System.out.print("Ingrese el contenido adicional para agregar a la oración: ");
                        String contenidoPlus = consola.nextLine();
                        sentencia += " " + contenidoPlus;
                        System.out.println("La nueva oración es: " + sentencia);
                        break;
                    case 9: 
                        System.out.println("Eligio la opcion: Salir.");
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } finally {
            consola.close();
        }
    }
}
