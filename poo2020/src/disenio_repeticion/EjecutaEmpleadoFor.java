package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de empleados a ingresar: ");
        int b = teclado.nextInt();
        teclado.nextLine();
        String cancelar = "";
        for(int c = 0; c <= b; c++){
            // Datos de entrada
            System.out.println("Ingrese el nombre: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese el valor del valor de la hora");
            double cuota = teclado.nextDouble();
            System.out.println("Ingrese las horas trabajadas: ");
            double horas = teclado.nextDouble();
            // Creacion de un nuevo objeto
            Empleado empleado = new Empleado(nombre, horas, cuota);
            // calculo del sueldo
            empleado.calcularSueldo();
            // Imprimir
            empleado.obtenerNombre();
            empleado.obtenerSueldo();
            teclado.nextLine();
        }
    }
}
