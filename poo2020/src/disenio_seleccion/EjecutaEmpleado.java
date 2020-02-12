package disenio_seleccion;

// Librería
import diseniopoo.Nota;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        // Scanner para dar paso al ingreso de datos por teclado
        Scanner teclado = new Scanner(System.in);

        // Datos ingresados por teclado
        System.out.println("Nombre del empleado: ");
        String nombre = teclado.nextLine();
        System.out.println("Horas trabajadas: ");
        double horas = teclado.nextDouble();
        System.out.println("Cuota: ");
        double cuota = teclado.nextDouble();

        //
        Empleado empleado = new Empleado(nombre, horas, cuota);
        empleado.calcularSueldo();
        empleado.obtnerNombre();
        empleado.obtenerSueldo();
    }
}
