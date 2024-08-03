import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Elije una opcion: \n1-Círculo\n2-Rectangulo");
        int opcion = consola.nextInt();
        switch (opcion){
            case 1 -> {
                System.out.print("Ingrese el radio del Círculo:");
                double radio = consola.nextDouble();
                double area = Math.PI * Math.pow(radio, 2); 
                double perimetro = Math.PI*radio;
                System.out.println("¿Desea conocer el area o perimetro del Círculo?\n1-Area\n2-Perimetro");
                int desicion = consola.nextInt();
                switch (desicion) {
                    case 1 -> System.out.println("El area del Círculo es "+area);
                    case 2 -> System.out.println("El perimetro del Círculo es "+perimetro);
                    default -> System.out.println("Opcion no valida");
                    }
                }
            case 2 -> {
                System.out.print("Ingrese la base del Rectángulo:");
                double base = consola.nextDouble();
                System.out.print("Ingrese la altura del Rectángulo:");
                double altura = consola.nextDouble();
                double area = base * altura;
                double perimetro = (2*base)+(2*altura); 
                System.out.println("¿Desea conocer el area o perimetro del Rectángulo?\n1-area\n2-perimetro");
                int desicion = consola.nextInt();
                switch (desicion) {
                    case 1 -> System.out.println("El area del Rectángulo es "+area);
                    case 2 -> System.out.println("El perimetro del Rectángulo es "+perimetro);
                    default -> System.out.println("Opcion no valida");
                }
            }
            default -> System.out.println("Opcion no valida");
        }
        consola.close();
    }
}
