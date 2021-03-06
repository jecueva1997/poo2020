package herenciavolumen;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {

        // Scanner
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
                    Cubo cubo = new Cubo(nombre, arista);

                    //Presentación de resultados
                    System.out.println("------------------------------");
                    System.out.println("Datos de la figura Cubo");
                    System.out.println("Nombre: " +cubo.getNombre());
                    System.out.println("Area: " +cubo.calcularVolumenCubo());
                    break;

                case 2:
                    // Ingreso de datos por teclado
                    nombre = "Cilindro";
                    System.out.println("Ingrese el radio del cilindro: ");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura del cilindro: ");
                    altura = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Cilindro cilindro = new Cilindro(nombre, radio, altura);

                    //Presentación de resultados
                    System.out.println("------------------------------");
                    System.out.println("Datos de la figura Cilindro");
                    System.out.println("Nombre: " +cilindro.getNombre());
                    System.out.println("Area: " +cilindro.calcularVolumenCilindro());
                    break;
                case 3:
                    // Ingreso de datos por teclado
                    nombre = "Cono";
                    System.out.println("Ingrese el radio del Cono: ");
                    radio = teclado.nextDouble();
                    System.out.println("Ingrese la altura del Cono: ");
                    altura = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Cono cono = new Cono(nombre, radio, altura);

                    //Presentación de resultados
                    System.out.println("------------------------------");
                    System.out.println("Datos de la figura Cono");
                    System.out.println("Nombre: " +cono.getNombre());
                    System.out.println("Area: " +cono.calcularVolumenCono());
                    break;
                case 4:
                    // Ingreso de datos por teclado
                    nombre = "Esfera";
                    System.out.println("Ingrese el radio de la Esfera: ");
                    radio = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Esfera esfera = new Esfera(nombre, radio);

                    //Presentación de resultados
                    System.out.println("------------------------------");
                    System.out.println("Datos de la figura Esfera");
                    System.out.println("Nombre: " +esfera.getNombre());
                    System.out.println("Area: " +esfera.calcularVolumenEsfera());
                    break;


            }
            // Presentación de opcion para seguir registrando datos
            System.out.println("Dese seguir calculando el sueldo de más empleados digite la palabra: si");
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
