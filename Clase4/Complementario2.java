package Clase4;

import java.util.Scanner;

public class Complementario2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = consola.nextDouble();
        boolean derechoAdescuento = precioProducto >= 100;
        if (derechoAdescuento) {
            double descuento = precioProducto * 0.1;
            double nuevoPrecio = precioProducto - descuento;
            System.out.print("El producto si aplica a descuento, el nuevo precio es: "+nuevoPrecio);
        } else {
            System.out.println("El producto no aplica a descuento, el precio es :" +precioProducto);
        }

        consola.close();
    }
}
