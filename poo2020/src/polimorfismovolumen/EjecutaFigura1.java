package polimorfismovolumen;

import java.util.Scanner;

public class EjecutaFigura1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nombre, cancelar;
        double arista, radio, altura;
        boolean salir = true;
        int opcion;

        // Cilo de repetición while
        while (salir == true){

            // Menú de opciones
            System.out.println("------------------ Areas Geómetricas --------------------");
            System.out.println(" Digitar 1 Cubo   ");
            System.out.println(" Digitar 2 Cilindro ");
            System.out.println(" Digitar 3 Cono ");
            System.out.println(" Digitar 4 Esfera ");
            System.out.println(" Digitar 5 Fin ");
            System.out.println("---------------------------------------------------------");
            int op = teclado.nextInt();

            // switch para las diferentes opciones que contiene el menú
            switch (op) {
                case 1:
                    // Ingreso de datos por teclado
                    nombre = "Cubo";
                    System.out.println("Ingrese el valor de la la arista del Cubo: ");
                    teclado.nextLine();
                    arista = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Cubo1 cubo = new Cubo1(nombre, arista);

                    cubo.calcularVolumen();
                    //Presentación de resultados
                    System.out.println("------------------------------");
                    System.out.println("Datos de la figura Cubo");
                    System.out.println("Nombre: " +cubo.getNombre());
                    System.out.println("Area: " +cubo.getVolumen());
                    break;

                case 2:
                    // Ingreso de datos por teclado
                    nombre = "Cilindro";
                    System.out.println("Ingrese el radio del cilindro: ");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura del cilindro: ");
                    altura = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Cilindro1 cilindro = new Cilindro1(nombre, radio, altura);

                    //Método de la clase padre
                    cilindro.calcularVolumen();

                    //Presentación de resultados
                    System.out.println("------------------------------");
                    System.out.println("Datos de la figura Cilindro");
                    System.out.println("Nombre: " +cilindro.getNombre());
                    System.out.println("Area: " +cilindro.getVolumen());
                    break;
                case 3:
                    // Ingreso de datos por teclado
                    nombre = "Cono";
                    System.out.println("Ingrese el radio del Cono: ");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura del Cono: ");
                    altura = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Cono1 cono = new Cono1(nombre, radio, altura);

                    //Método de la clase padre
                    cono.calcularVolumen();

                    //Presentación de resultados
                    System.out.println("------------------------------");
                    System.out.println("Datos de la figura Cono");
                    System.out.println("Nombre: " +cono.getNombre());
                    System.out.println("Area: " +cono.getVolumen());
                    break;
                case 4:
                    // Ingreso de datos por teclado
                    nombre = "Esfera";
                    System.out.println("Ingrese el radio de la Esfera: ");
                    radio = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Esfera1 esfera = new Esfera1(nombre, radio);

                    //Método de la clase padre
                    esfera.calcularVolumen();
                    
                    //Presentación de resultados
                    System.out.println("------------------------------");
                    System.out.println("Datos de la figura Esfera");
                    System.out.println("Nombre: " +esfera.getNombre());
                    System.out.println("Area: " +esfera.getVolumen());
                    break;


            }
            // Presentación de opcion para seguir registrando datos
            System.out.println("Dese seguir calculando el volumen de otras figuras: si");
            teclado.nextLine();
            cancelar = teclado.nextLine();

            //  Condicion para establecer el limite de figuras
            if (cancelar.equals("si")) {
                salir = true;
            } else {
                salir = false;
            }

        }
    }
}
