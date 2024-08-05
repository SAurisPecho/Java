package Clase9;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese una contraseña: ");
            String contraseña = consola.next();
            if (contraseña.length() >= 8) {
                if (contraseña.matches(".*[A-Z].*")) {
                    if (contraseña.matches(".*[a-z].*")) {
                        if (contraseña.matches(".*[0-9].*")) {
                            if (contraseña.matches(".*[!@#$%^&*().?].*")) {
                                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
                            } else {
                                System.out.println("Contraseña no segura. Debe tener al menos un carácter especial(!,@,#,$)");
                            }
                        } else {
                            System.out.println("Contraseña no segura. Debe tener al menos un número y al menos un carácter especial(!,@,#,$).");
                        }
                    } else {
                        System.out.println("Contraseña no segura. Debe tener al menos una letra minúscula, al menos un número y al menos un carácter especial(!,@,#,$).");
                    }
                } else {
                    System.out.println("Contraseña no segura. Debe tener al menos una letra mayúscula, una letra minúscula, al menos un número y al menos un carácter especial(!,@,#,$).");
                }
            } else {
                System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, al menos un número y al menos un carácter especial(!,@,#,$).");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        }
        consola.close();
    }
}
