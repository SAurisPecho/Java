import java.util.Scanner;

public class ComplementarioPalabra {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        String[] array = {"anclo", "ancla", "ancho", "ancle", "ambas", "museos", "videojuego", "noches", "audiovisual"};
        int seleccion = (int) (Math.random()*array.length);
        String palabra = array[seleccion];
        int intentos = 10;

        char[] pista = new char[palabra.length()];
        for (int i = 0; i < pista.length; i++) {
            pista[i] = '_';
        }

        System.out.println("Juego de Adivina la Palabra");
        obtenerPista(pista);
        System.out.println("La pista inicial es: la palabra tiene "+palabra.length()+" letras.");
        System.out.println("Tienes " + intentos + " intentos para adivinar la palabra.");


        while (intentos > 0 && contieneGuiones(pista)  ) {
            System.out.println("Ingrese una letra para comprobar si forma parte de la palabra: ");
            char letra = consola.next().charAt(0);

            if (comprobarLetra(palabra, letra, pista)) {
                System.out.println("¡Buena elección!");
            } else {
                intentos--;
                System.out.println("Letra incorrecta. Te quedan " + intentos + " intentos.");
            }

            obtenerPista(pista);
        }

        if (!contieneGuiones(pista)) {
            System.out.println("¡Felicidades! Has adivinado la palabra.");
        } else {
            System.out.println("Te has quedado sin intentos. La palabra era: " + palabra);
        }
    }


    public static void obtenerPista (char[] pista){
        for (char c : pista) {
            System.out.print(c+" ");
        }
        System.out.println();
    }

    public static boolean contieneGuiones (char[] pista){
        for (char c : pista) {
            if (c == '_') {
                return true;
            }
        }
        return false;
    }

    public static boolean comprobarLetra(String palabra, char letra, char[] pista){
        boolean seEncuentra = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                pista[i] = letra;
                seEncuentra = true;
            }
        }
        return seEncuentra;
    }
}
