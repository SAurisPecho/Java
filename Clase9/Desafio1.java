package Clase9;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.println("Ingrese la temperatura: ");
            double temperatura = consola.nextDouble();
            System.out.println("Ingrese la unidad de medida (C/F): ");
            String unidad = consola.next().toUpperCase();
            switch(unidad){
                case "C" -> {
                    double fahrenheit = (temperatura*9/5)+32;
                    System.out.println(temperatura+" grados Celsius equivale a "+fahrenheit+" grados Fahrenheit.");
                }
                case "F" -> {
                    double celcius = (temperatura-32)*5/9;
                    System.out.println(temperatura+" grados Fahrenheit equivale a "+celcius+" grados Celsius.");
                }
                default -> System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        } catch (Exception e) {
            String mensaje = e.getMessage();
            System.out.println("Ocurrio un error!: "+ mensaje);
        }
        consola.close();
    }
}
