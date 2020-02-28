package herenciafigura;

import disenio_repeticion.Alumni;

import java.util.Scanner;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        double baseTrian, alturaTrian, baseRecta, alturaRecta, ladoCuadra, radio;
        int horas;
        double valorHora, valorMensual;
        // Menú para ingreso de datos
        System.out.println("------------------ Figura -------------------------------");
        System.out.println(" Digitar 1: para calcular el área del triangulo   ");
        System.out.println(" Digitar 2: para calcular el área del reactángulo ");
        System.out.println(" Digitar 3: para calcular el área del cuadrado ");
        System.out.println(" Digitar 2: para calcular el área del circulo ");
        System.out.println("---------------------------------------------------------");
        int op = teclado.nextInt();
        // Opciones de datos
        switch (op) {
            case 1:
                nombre = "Triangulo";
                System.out.println("Ingrese la base: ");
                teclado.nextLine();
                baseTrian = teclado.nextDouble();
                System.out.println("Ingrese la altura: ");
                alturaTrian = teclado.nextDouble();
                Triangulo triangulo = new Triangulo(nombre, baseTrian, alturaTrian);

                System.out.println("------------------------------");
                System.out.println("Datos de la figura Triángulo");
                System.out.println("Nombre: " +triangulo.getNombre());
                System.out.println("Area: " +triangulo.calacularAreaTrian());
                break;

            case 2:
                nombre = "Rectangulo";
                System.out.println("Ingrese la base: ");
                teclado.nextLine();
                baseRecta = teclado.nextDouble();
                System.out.println("Ingrese la altura: ");
                alturaRecta = teclado.nextDouble();
                Rectangulo rectangulo = new Rectangulo(nombre, baseRecta, alturaRecta);

                System.out.println("------------------------------");
                System.out.println("Datos de la figura Triángulo");
                System.out.println("Nombre: " +rectangulo.getNombre());
                System.out.println("Area: " +rectangulo.calcularAreaRectan());
                break;
            case 3:
                nombre = "Cuadrado";
                System.out.println("Ingrese el lado: ");
                teclado.nextLine();
                ladoCuadra = teclado.nextDouble();
                Cuadrado cuadrado = new Cuadrado(nombre, ladoCuadra);

                System.out.println("------------------------------");
                System.out.println("Datos de la figura Cuadrado");
                System.out.println("Nombre: " +cuadrado.getNombre());
                System.out.println("Area: " +cuadrado.calcularAreaCuadr());
                break;
            case 4:
                nombre = "Circulo";
                System.out.println("Ingrese el radio: ");
                teclado.nextLine();
                radio = teclado.nextDouble();
                Circulo circulo = new Circulo(nombre, radio);

                System.out.println("------------------------------");
                System.out.println("Datos de la figura Circulo");
                System.out.println("Nombre: " +circulo.getNombre());
                System.out.println("Area: " +circulo.calcularAreaCirc());
                break;

            default:
                System.out.println("No existe la opción");
        }
    }
}
