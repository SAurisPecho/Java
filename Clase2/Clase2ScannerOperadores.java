import java.util.Scanner;

public class Clase2ScannerOperadores {

    public static void main(String[] args) {
        // //ACTIVIDAD
        // Scanner consola = new Scanner(System.in);
        // System.out.print("Porfavor ingrese su nombre:");
        // String nombre = consola.nextLine();
        // System.out.print("Porfavor ingrese su edad:");
        // int edad = consola.nextInt();
        // System.out.println("Su nombre es "+nombre+" y su edad es "+edad+ " años");
        // consola.close();

        // //ACTIVIDAD 1
        // Scanner consola2 = new Scanner(System.in);
        // int var1 = 8;
        // int var2 = 2;
        // System.out.println("La suma de las 2 variables es : "+ (var1+var2));
        // System.out.println("La resta de 8 - 2 es : "+ (var1-var2));
        // System.out.println("La multiplicacion de las 2 variables es : "+ (var1*var2));
        // System.out.println("La division de 8 entre 2 es : "+ (var1/var2));
        // System.out.println("el restante de dividir las 2 variables es : "+ (var1%var2));
        // System.out.print("Porfavor ingrese el primer numero:");
        // int num1 = consola2.nextInt();
        // System.out.print("Porfavor ingrese el segundo numero:");
        // int num2 = consola2.nextInt();
        // System.out.print("La suma de las 2 variables es :" + (num1+num2));
        // consola2.close();

        // //ACTIVIDAD 2
        // Scanner consola3 = new Scanner(System.in);
        // System.out.print("Porfavor ingresa un numero entero:");
        // int numb1 = consola3.nextInt();
        // System.out.print("Porfavor ingresa un segundo numero entero:");
        // int numb2 = consola3.nextInt();
        // String mayor = (numb1 > numb2) ? "mayor" : "no mayor";
        // System.out.println("El primer número es " + mayor + " que el segundo.");
        // String distinto = (numb1!=numb2) ? "es distinto" : "es igual";
        // System.out.println("El primer numero "+distinto+" al segundo");
        // System.out.println("el numero "+numb1+" es divisible por 2 = "+ ((numb1%2==0) ? "es divisible" : "no es divisible"));
        // System.out.print("Porfavor ingresa un tercer numero entero:");
        // int numb3 = consola3.nextInt();
        // System.out.print("Porfavor ingresa un cuarto numero entero:");
        // int numb4 = consola3.nextInt();
        // String numb1mayor = (numb1>numb2) ? "es mayor":"no es mayor";
        // String numb3mayor = (numb3>numb4) ? "es mayor":"no es mayor";

        // String numb1o3mayor = (numb1>numb2) || (numb3>numb4) ? "es mayor":"no es mayor";

        // System.out.println("el primer numero "+numb1mayor+" al segundo y el tercer numero "+numb3mayor+" al cuarto numero");
        // System.out.println("el primer numero "+numb1o3mayor+" al segundo o el tercer numero "+numb3mayor+" al cuarto numero");
        // consola3.close();

        // //COMPLEMENTARIO 1
        // Scanner consola4 = new Scanner (System.in);
        
        // int ANIOACTUAL = 2024;
        // System.out.print("Ingrese su año de nacimiento:");
        // int añoNacimiento = consola4.nextInt() ;
        // int calculoEdad = (ANIOACTUAL-añoNacimiento);
        // String mayorEdad = (calculoEdad >= 18 ) ? "es mayor de edad": "es menor de edad";
        // System.out.println("Usted "+mayorEdad);
        // consola4.close();

        //COMPLEMENTARIO 2
        Scanner consola5 = new Scanner (System.in);

        double baseRectangulo;
        double alturaRectangulo;
        System.out.print("Ingrese el tamaño de base del rectangulo:");
        baseRectangulo = consola5.nextDouble();
        System.out.print("Ingrese el tamaño de la altura del rectangulo:");
        alturaRectangulo = consola5.nextDouble();
        double perimetro = ((baseRectangulo*2)+(alturaRectangulo*2));
        double area = (baseRectangulo*alturaRectangulo);
        System.out.println("El perimetro del rectangulo es "+perimetro+" metros.");
        System.out.println("El area del rectangulo es "+area+" metros cuadrados.");
        consola5.close();
    }
}