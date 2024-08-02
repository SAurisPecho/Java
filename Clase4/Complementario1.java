package Clase4;

import java.util.Scanner;

public class Complementario1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String contraseña = "123456abcd";
        System.out.print("Ingrese su contraseña: ");
        String contraseñaIngresada = consola.next();
        boolean acceso = contraseña.equals(contraseñaIngresada);
        if (acceso ){
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        consola.close();
    }
}
