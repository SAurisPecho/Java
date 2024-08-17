import java.util.Scanner;
import java.util.Arrays;

public class ManipulandoOraciones {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        String sentencia = crearOracion();

        do {
            opcion = mostrarMenu(opcion);
            consola.nextLine();
            switch (opcion) {
                case 1:
                    sentencia = crearBorrarOracion(sentencia);
                    break;
                case 2:
                    int cantidad = cantidadCaracteres(sentencia);
                    System.out.println("La oración tiene "+cantidad+" caracteres.");
                    break;
                case 3:
                    int palabrasCantidad = cantidadPalabras(sentencia);
                    System.out.println("La oración tiene "+palabrasCantidad+" palabras.");
                    break;
                case 4:
                    String[] palabrs = ordenarPalabras(sentencia);
                    System.out.println("Palabras ordenadas alfabéticamente: "+Arrays.toString(palabrs));
                    break;
                case 5:
                    encontrarPalabraIndice(sentencia);
                    break;
                case 6:
                    buscarPalabra(sentencia);
                    break;
                case 7:
                    sentencia = modificarPalabra(sentencia);
                    System.out.println("La nueva oracion es: "+sentencia);
                    break;
                case 8:
                    sentencia = agregarContenido(sentencia);
                    System.out.println("La nueva oración es: " + sentencia);
                    break;
                case 9:
                    System.out.println("Ha elegido la opcion:\nSalir");
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                    break;
            }
        } while (opcion != 9);
    }

    public static String crearOracion () {
        System.out.println("Ingrese una oración: ");
        String sentencia = consola.nextLine();
        return sentencia;
    }

    public static int mostrarMenu(int opcion) {
        System.out.println("Menú Interactivo: \n 1 - Crear oración o Borrar oración. \n 2 - Cantidad de caracteres de la oración. \n 3 - Cantidad de palabras de la oración. \n 4 - Mostrar palabras ordenadas alfabéticamente. \n 5 - Ingresar un número y devolver la palabra correspondiente. \n 6 - Buscar palabra dentro de la oración. \n 7 - Modificar palabra dentro de la oración. \n 8 - Agregar contenido a la oración. \n 9 - Salir. ");
        System.out.print("Elija el numero de la opcion que prefiera: ");
        opcion = consola.nextInt();
        return opcion;
    }

    public static String crearBorrarOracion (String sentencia){
        System.out.println("Ha elegido la opcion: ");
        if (sentencia.isEmpty()) {
            System.out.println("Crear oración: ");
            sentencia = consola.nextLine();
        } else {
            System.out.println("Borrar oración: ");
            System.out.println("Borrando...");
            sentencia = "";
        }
        return sentencia;
    }

    public static int cantidadCaracteres (String sentencia) {
        System.out.println("Ha elegido la opcion:\nCantidad de caracteres de la oración ");
        int cantidad = sentencia.length();
        return cantidad;
    }

    public static int cantidadPalabras (String sentencia) {
        System.out.println("Ha elegido la opcion:\nCantidad de palabras de la oración ");
        String[] palabras = sentencia.split("\\s+");
        return palabras.length;
    }

    public static String[] ordenarPalabras (String sentencia) {
        System.out.println("Ha elegido la opcion:\nMostrar palabras ordenadas alfabéticamente.");
        String[] palabrs = sentencia.split("\\s+");
        Arrays.sort(palabrs);
        return palabrs;
    }

    public static void encontrarPalabraIndice (String sentencia) {
        System.out.println("Ha elegido la opcion:\nIngresar un número y devolver la palabra correspondiente.");
        String[] palabs = sentencia.split("\\s+");
        int nums = palabs.length;
        if (nums == 0){
            System.out.println("La oración está vacía. No hay palabras disponibles.");
            return;
        }
        int eleccion;
        do {
            System.out.print("Ingrese un número entre 1 y " + nums + ": ");
            eleccion = consola.nextInt();
            consola.nextLine();
            if (eleccion > nums || eleccion < 1) {
            System.out.println("Número inválido. Intente nuevamente");
            }
        } while (eleccion > nums || eleccion < 1);
        System.out.println("La palabra con la posicion "+eleccion+" es "+palabs[eleccion-1]);
    }

    public static void buscarPalabra (String sentencia) {
        System.out.println("Ha elegido la opcion:\nBuscar palabra dentro de la oración.");
        System.out.println("Ingrese la palabra a buscar: ");
        String palabra = consola.nextLine();
        String[] cadena = sentencia.split("\\s+");
        boolean encontrado = false;
        for (int i = 0; i < cadena.length; i++) {
            if (cadena[i].equals(palabra)) {
                System.out.println("La palabra buscada "+palabra+" si fue encontrada, en la posicion: "+(i+1)+".");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("La palabra buscada "+palabra+" no fue encontrada.");
        }
    }

    public static String modificarPalabra (String sentencia){
        System.out.println("Ha elegido la opcion:\nModificar palabra dentro de la oración");
        System.out.println("Ingrese la palabra a cambiar: ");
        String palabraaCambio = consola.nextLine();
        
        String[] cad = sentencia.split("\\s+");
        boolean encontrad = false;
        do {
            for (int i = 0; i < cad.length; i++) {
                if (cad[i].equals(palabraaCambio)) {
                    encontrad = true;
                }
            }
            if (!encontrad) {
                System.out.println("No se encontro la palabra, ingrese la palabra a cambiar: ");
                palabraaCambio = consola.nextLine();
            }
        } while (!encontrad);
        
        System.out.print("Ingrese la nueva palabra: ");
        String nuevaPalabra = consola.nextLine();
        sentencia = sentencia.replace(palabraaCambio, nuevaPalabra);
        return sentencia;
    }

    public static String agregarContenido (String sentencia) {
        System.out.println("Ha elegido la opcion:\nAgregar contenido a la oración");
        System.out.print("Ingrese el contenido adicional para agregar a la oración: ");
        String contenidoPlus = consola.nextLine();
        sentencia += " "+contenidoPlus;
        return sentencia;
    }
}