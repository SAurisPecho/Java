package Clase20;
import java.util.Scanner;

public class FigurasGeometricas {
    public static Scanner consola = new Scanner(System.in);

    public static void main(String[] args) {
        int figura = elegirFigura();
        int operacion = elegirOperacion();

        double resultado = 0;

        switch (figura) {
            case 1: 
                double radioCirculo = obtenerDatosCirculo();
                resultado = operacionesCirculo(radioCirculo, operacion);
                break;
            case 2:
                double[] datosTriangulo = obtenerDatosTriángulo(operacion);
                resultado = operacionesTriangulo(datosTriangulo, operacion);
                break;
            case 3: 
                double[] datosParalelogramo = obtenerDatosParalelogramo(operacion);
                resultado = operacionesParalelogramo(datosParalelogramo, operacion);
                break;
            default:
                System.out.println("Figura no válida.");
                return;
        }
    
        System.out.println("El resultado es: " + resultado);
    }

    public static int elegirFigura() {
        System.out.println("Figuras Geométricas");
        System.out.println("1. Círculo \n2. Triángulo\n3. Paralelogramo");
        System.out.print("Elija un numero que represente la figura: ");
        return consola.nextInt();
    }

    public static int elegirOperacion() {
        System.out.println("Operacion a realizar");
        System.out.println("1. Área\n2. Perímetro");
        System.out.print("Elija un numero que represente la operacion a realizar: ");
        return consola.nextInt();
    }

    public static double obtenerDatosCirculo() {
        System.out.print("Escriba el radio del circulo: ");
        return consola.nextDouble();
    }

    public static double[] obtenerDatosTriángulo(int operacion) {
        double[] datos = new double[3];
        if (operacion == 1) {
            System.out.print("Escriba la base del triángulo: ");
            datos[0] = consola.nextDouble();
            System.out.print("Escriba la altura del triángulo: ");
            datos[1] = consola.nextDouble();
        } else if (operacion == 2) {
            System.out.print("Escriba el lado a del triángulo: ");
            datos[0] = consola.nextDouble();
            System.out.print("Escriba el lado b del triángulo: ");
            datos[1] = consola.nextDouble();
            System.out.print("Escriba el lado c del triángulo: ");
            datos[2] = consola.nextDouble();
        }
        return datos;
    }

    public static double[] obtenerDatosParalelogramo (int operacion) {
        double[] datos = new double[2];
        System.out.print("Escriba la base del paralelogramo: ");
        datos[0] = consola.nextDouble();
        System.out.print("Escriba la altura del paralelogramo: ");
        datos[1] = consola.nextDouble();
        return datos;
    }

    public static double operacionesCirculo(double radio, int ope){
        double resultado = 0;
        if(ope == 1){
            resultado = Math.PI*Math.pow(radio,2);
        } else if (ope ==2){
            resultado = 2*Math.PI*radio;
        } else {
            System.out.println("Opción no valida.");
            return 0;
        }
        return resultado;
    }

    public static double operacionesTriangulo(double[]datTriangulo, int ope){
        double resultado = 0;
        if(ope == 1){
            resultado = (datTriangulo[0]*datTriangulo[1])/2;
        } else if (ope ==2){
            resultado = datTriangulo[0]+datTriangulo[1]+datTriangulo[2];
        } else {
            System.out.println("Opción no valida.");
            return 0;
        }
        return resultado;
    }

    public static double operacionesParalelogramo(double[]datParale, int ope){
        double resultado = 0;
        if(ope == 1){
            resultado = datParale[0]*datParale[1];
        } else if (ope ==2){
            resultado = 2*(datParale[0]+datParale[1]);
        } else {
            System.out.println("Opción no valida.");
            return 0;
        }
        return resultado;
    }
}
