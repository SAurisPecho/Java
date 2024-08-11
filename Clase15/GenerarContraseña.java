package Clase15;
import java.util.Scanner;

public class GenerarContraseña {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("Ingrese la longitud de la contraseña: ");
            int longitud = consola.nextInt();
            char[] letras = new char[longitud];
            for (int i = 0; i < longitud; i++) {
                int tipo = (int)(Math.random()*3);
                char letra = 0;
                switch (tipo) {
                    case 0 -> letra = (char) ((int)(Math.random()*(90-65+1)+65)); //MAYUSCULA
                    case 1 -> letra = (char) ((int)(Math.random()*(122-97+1)+97)); //MINUSCULA
                    case 2 -> letra = (char) ((int)(Math.random()*(57-48+1)+48));  //DIGITOS
                    default -> System.out.println("Error!");
                }
                letras[i] = letra;
            }

            boolean conMayus = false;
            boolean conMinus = false;
            boolean conDigitos = false;

            for (char c : letras) {
                if(Character.isUpperCase(c)){
                    conMayus = true;
                } else if (Character.isLowerCase(c)) {
                    conMinus = true;
                } else if (Character.isDigit(c)) {
                    conDigitos = true;
                }
            }
            
            if (conMayus && conMinus && conDigitos) {
                String contraseña = new String(letras);
                System.out.println("CONTRASEÑA GENERADA: "+contraseña);
            } else {
                System.out.println("Contraseña no valida.");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Numero no valido.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            consola.close();
        }
        
    }
}
