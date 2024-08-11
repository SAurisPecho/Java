package Clase18;
import java.util.Scanner;

public class RegistroAlumnos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        try {
            String[] nombres = new String[100];
            double[] notas = new double[100];
            int contadorAlumnos = 0;

            while (true) {
                System.out.println("\nMenú de opciones:");
                System.out.println("1 - Registrar alumno");
                System.out.println("2 - Mostrar todos los alumnos");
                System.out.println("3 - Mostrar promedio de notas");
                System.out.println("4 - Buscar alumno por nombre");
                System.out.println("5 - Modificar nota por nombre");
                System.out.println("6 - Eliminar alumno por nombre");
                System.out.println("7 - Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = consola.nextInt();
                consola.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombre = consola.next().trim();
                        if (nombre.isEmpty()) {
                            System.out.println("El nombre no puede estar vacío.");
                            break;
                        }
                        System.out.print("Ingrese la nota del alumno (0.00 - 10.00): ");
                        double nota;
                        try {
                            nota = consola.nextDouble();
                        } catch (Exception e) {
                            System.out.println("Error: La nota debe ser un número.");
                            consola.nextLine();
                            break;
                        }
                        if (nota < 0.0 || nota > 10.0) {
                            System.out.println("La nota debe estar entre 0.00 y 10.00.");
                            break;
                        }
                        nombres[contadorAlumnos] = nombre;
                        notas[contadorAlumnos] = nota;
                        contadorAlumnos++;
                        System.out.println("Alumno registrado exitosamente.");
                        break;
                    case 2:
                        System.out.println("Lista de alumnos registrados:");
                        for (int i = 0; i < contadorAlumnos; i++) {
                            System.out.println("Alumno: " + nombres[i] + ", Nota: " + notas[i]);
                        }
                        break;
                    case 3:
                        if (contadorAlumnos == 0) {
                            System.out.println("No hay alumnos registrados.");
                        } else {
                            double suma = 0;
                            for (int i = 0; i < contadorAlumnos; i++) {
                                suma += notas[i];
                            }
                            double promedio = suma / contadorAlumnos;
                            System.out.println("El promedio de notas es: " + promedio);
                        }
                        break;
                    case 4:
                        System.out.print("Ingrese el nombre del alumno a buscar: ");
                        String nombreBusqueda = consola.nextLine().trim();
                        boolean encontrado = false;
                        for (int i = 0; i < contadorAlumnos; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreBusqueda)) {
                                System.out.println("Alumno: " + nombres[i] + ", Nota: " + notas[i]);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                        break;
                    case 5:
                        System.out.print("Ingrese el nombre del alumno cuya nota desea modificar: ");
                        String nombreModificacion = consola.nextLine().trim();
                        encontrado = false;
                        for (int i = 0; i < contadorAlumnos; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreModificacion)) {
                                System.out.print("Ingrese la nueva nota (0.00 - 10.00): ");
                                double nuevaNota = consola.nextDouble();
                                consola.nextLine(); 

                                if (nuevaNota < 0.0 || nuevaNota > 10.0) {
                                    System.out.println("La nota debe estar entre 0.00 y 10.00.");
                                } else {
                                    notas[i] = nuevaNota;
                                    System.out.println("Nota modificada exitosamente.");
                                }
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                        break;
                    case 6:
                        System.out.print("Ingrese el nombre del alumno que desea eliminar: ");
                        String nombreEliminar = consola.nextLine().trim();
                        encontrado = false;
                        for (int i = 0; i < contadorAlumnos; i++) {
                            if (nombres[i].equalsIgnoreCase(nombreEliminar)) {
                                for (int j = i; j < contadorAlumnos - 1; j++) {
                                    nombres[j] = nombres[j + 1];
                                    notas[j] = notas[j + 1];
                                }
                                contadorAlumnos--;
                                System.out.println("Alumno eliminado exitosamente.");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                        break;
                    case 7:
                        System.out.println("Eligio la opcion: Salir.");
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error!");
        } finally {
            consola.close();
        }
    }
}
