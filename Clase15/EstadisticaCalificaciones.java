package Clase15;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class EstadisticaCalificaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            System.out.print("¿Cuantos alumnos son? ");
            int alumnos = consola.nextInt();
            String[] notas = new String[alumnos];
            Random random = new Random();

            for (int i = 0; i < notas.length; i++) {
                double cali = random.nextDouble()*12;
                
                notas[i] = String.format("%.2f", cali);
            }
            
            ArrayList<Double> desaprobado = new ArrayList<>();
            ArrayList<Double> aprobado = new ArrayList<>();
            ArrayList<Double> excelente = new ArrayList<>();

            double sumaTotal = 0;
            double sumaDesaprobado = 0;
            double sumaAprobado = 0;
            double sumaExcelente = 0;

            int des = 0;
            int apr = 0;
            int exc = 0;

            for (String nota : notas) {
                double calificacion = Double.parseDouble(nota);
                sumaTotal += calificacion;

                if (calificacion < 4) {
                    desaprobado.add(calificacion);
                    sumaDesaprobado += calificacion;
                    des++;
                } else if ( calificacion >=4 && calificacion < 10) {
                    aprobado.add(calificacion);
                    sumaAprobado += calificacion;
                    apr++;
                } else {
                    excelente.add(calificacion);
                    sumaExcelente += calificacion;
                    exc++;
                } 
            }
            
            double promedioTotal = sumaTotal / notas.length;
            double promedioDesaprobado =  desaprobado.isEmpty() ? 0 : sumaDesaprobado / desaprobado.size();
            double promedioAprobado =  aprobado.isEmpty() ? 0 : sumaAprobado / aprobado.size();
            double promedioExcelente =  excelente.isEmpty() ? 0 : sumaExcelente / excelente.size();

            System.out.println("Hay "+des+" alumnos desaprovados.");
            System.out.println("Hay "+apr+" alumnos aprovados.");
            System.out.println("Hay "+exc+" alumnos excelentes.");

            System.out.println("El promedio de las notas de alumnos desaprobados es: "+String.format("%.2f", promedioDesaprobado));
            System.out.println("El promedio de las notas de alumnos aprobados es: "+String.format("%.2f", promedioAprobado));
            System.out.println("El promedio de las notas de alumnos excelentes es: "+String.format("%.2f", promedioExcelente));
            System.out.println("El promedio total de notas es: "+String.format("%.2f", promedioTotal));

        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } finally {
            consola.close();
        }
        
    }
}
