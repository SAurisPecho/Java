import java.util.Scanner;

public class Clase3ActividadIntegradora1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // //IDENTIFICADOR DE PAR O IMPAR
        // System.out.print("Ingrese un numero: ");
        // int num = consola.nextInt();        
        // String parOimpar = (num%2==0) ? "es par":"es impar";
        // boolean opeInvalida = (num == 0);
        // if (opeInvalida){System.out.println("El numero es invalido ");}
        // else {System.out.println("El numero "+parOimpar);}

        //CALCULADORA BASICA
        System.out.print("Calculadora\nIngrese el primer numero:");
        double num1 = consola.nextDouble();
        System.out.print("Ingrese el segundo numero:");
        double num2 = consola.nextDouble();
        System.out.print("1 - Sumar\n2 - Restar\n3 - Multiplicar\n4 - Dividir\nIngrese el numero de opciond el calculo que quieres realizar: ");
        int operacion = consola.nextInt();

        boolean opeValida = operacion >=1 && operacion <=4;
        String resultado = operacion == 4 && num2 == 0 ? "La operacion es invalida, no se puede dividir por 0.":
                                opeValida ? "El resultado es: " + (
                                    operacion == 1 ? (num1+num2) : 
                                        operacion == 2 ? (num1-num2):
                                            operacion == 3 ? (num1*num2): (num1/num2)
                                )
                                :"Opción de operación no válida.";
                                
        // int suma = num1 + num2;
        // int resta = num1 - num2;
        // int multiplicacion = num1 * num2;
        // int division = num1 / num2;
        // int resultado = (operacion==1) ? suma : 
        //                                 ((operacion==2) ? resta : 
        //                                                     ((operacion==3) ? multiplicacion : division ));

        System.out.println(resultado);
        consola.close();
    }
}
