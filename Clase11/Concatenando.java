import java.util.Scanner;

public class Concatenando {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String[] array = {"mesa", "camara","foco","avion"};
        String concatenacion = "";
        boolean esPrimero = true;
        for (String elemento : array) {
            if (!esPrimero) {
                concatenacion += " ";
            }
            concatenacion += elemento;
            esPrimero = false;
        }          
        System.out.println("todos los elementos juntos: "+concatenacion);

        consola.close();
    }
}
