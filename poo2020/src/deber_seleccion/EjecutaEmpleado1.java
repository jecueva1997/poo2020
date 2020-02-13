package deber_seleccion;

import disenio_seleccion.Empleado;
// Libreria
import java.util.Scanner;
public class EjecutaEmpleado1 {
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

        // Crear objeto desde clase empleado
        Empleado1 empleado1 = new Empleado1(nombre, horas, cuota);
        empleado1.calcularSueldo();
        empleado1.obtenerNombre();
        empleado1.obtenerSueldo();
    }

}
