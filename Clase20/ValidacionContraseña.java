package Clase20;
import java.util.Scanner;

public class ValidacionContraseña {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese una contraseña: ");
        String contraseña = consola.next();
        boolean segura = esSegura(contraseña);
        if (segura) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, al menos un número y al menos un carácter especial(!,@,#,$).");
        }
    }

    public static boolean esSegura(String contr) {
        if (tieneLongitudCorrecta(contr)
        && tieneMayuscula(contr)
        && tieneMinuscula(contr)
        && tieneNumero(contr)
        && tieneCaracterEspecial(contr)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean tieneLongitudCorrecta(String contr) {
        return contr.length() > 7 ;
    }
    public static boolean tieneMayuscula(String contr) {
        return contr.matches(".*[A-Z].*");
    }
    public static boolean tieneMinuscula(String contr) {
        return contr.matches(".*[a-z].*");
    }
    public static boolean tieneNumero(String contr) {
        return contr.matches(".*[0-9].*");
    }
    public static boolean tieneCaracterEspecial(String contr) {
        return contr.matches(".*[!@#$%^&*().?].*");
    }
    
}
