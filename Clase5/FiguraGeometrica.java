import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 3 segun la figura geometrica:\n1-Círculo\n2-Cuadrado\n3-Triángulo");
        int figura = consola.nextInt();
        double area;
        switch (figura) {
            case 1 -> { System.out.print("Ingrese el radio del Círculo:");
                        double radio = consola.nextDouble();
                        area = Math.PI * Math.pow(radio, 2);
                        System.out.println("El area del circulo es :"+ area);
            }
            case 2 -> { System.out.print("Ingrese el lado del Cuadrado:");
                        double lado = consola.nextDouble();
                        area = Math.pow(lado, 2);
                        System.out.println("El area del cuadrado es :"+ area);
            }
            case 3 -> { System.out.print("Ingrese la base del Triángulo:");
                        double base = consola.nextDouble();
                        System.out.print("Ingrese la altura del Triángulo:");
                        double altura = consola.nextDouble();
                        area = base * altura ;
                        System.out.println("El area del Triángulo es :"+ area);
            }
            default -> System.out.println("Opcion no valida");
        }
        consola.close();
    }
}
