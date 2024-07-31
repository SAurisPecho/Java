public class App {
    public static void main(String[] args) {
        boolean estuDiante = true ;
        //char letrAd = 'd';
        String nombreCurso = "Java";
        int numeroEntero = 2;
        // long numeroMayor = 262633636;
        // float numeroMayorr = 1.45;
        String miNombre = "Sarai";
        int miEdad = 20;
        // double temperaturaCiudad = 36.7f; //permite decimal y cubre un amplio rango de valores posibles para la temperatura
        // double precioProducto = 99.99; //permite decimal y cumple con cubrir el rango de posibles precios de productos
        // String nombreCompleto = "Mauro Montes"; //el nombre completo de una persona esta compuesto por diferentes palabras.
        // String fechaNacimiento = "18/06/2000"; //esta compuesta por numeros enteros, pero requiere separadores.
        // int habitantesCiudad = 35000; //El número de habitantes de una ciudad es un numero entero dependiendo el tamaño de la ciudad si es pequeño int pero si es extremadamente grande long.
        // short peliculaDuracion = 120; // el rango de una pelicula no suele ser tan extenso en minutos, short tiene un rango suficiente. 
        // boolean articuloDisponible = true; //nos brinda una respuesta clara true o false.
        // double distanciaCiudades = 2145; //admite un rango valido y extenso ademas de decimales para distancias en kilometros.
        // String numeroTelefono = "+66 123-85963145"; //porque el numero puede requerir de un codigo de pais, guiones y espacios.
        // int productoCantidad = 17; // porque los productos son numeros enteros y cuenta con un rango suficiente para almacenar el dato.
        System.out.println("Bienvenido a tu curso de Java");
        System.out.println("Mi nombre es Sarai");
        System.out.println("Mi edad es 20 años");
        System.out.println("las variables son:" + estuDiante + nombreCurso + numeroEntero);
        System.out.println("Mi nombre es " + miNombre + " y tengo " + miEdad + " años");

        String mensajeBienvenida = "Bienvenido a Java";
        int temperaturaActual = 19;
        boolean datoLogico = true;
        System.out.println("Mensaje de bienvenida: " + mensajeBienvenida);
        System.out.println("Temperatura actual: " + temperaturaActual + " grados");
        System.out.println("Dato lógico: " + datoLogico);

    }
}