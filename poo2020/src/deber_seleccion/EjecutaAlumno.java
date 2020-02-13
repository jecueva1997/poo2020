package deber_seleccion;

import java.util.Scanner;
public class EjecutaAlumno {
    public static void main(String[] args) {
        // Scanner para dar paso al ingreso de datos por teclado
        Scanner teclado = new Scanner(System.in);

        // Datos ingresados por teclado
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la primera calificación: ");
        double calific1 = teclado.nextDouble();
        System.out.println("Ingrese la segunda calificación: ");
        double calific2 = teclado.nextDouble();
        System.out.println("Ingrese la tercera calificación: ");
        double calific3 = teclado.nextDouble();
        System.out.println("Ingrese la cuarta calificación: ");
        double calific4 = teclado.nextDouble();

        // Crear objeto desde clase empleado
        Alumno alumno = new Alumno(nombre, calific1, calific2, calific3, calific4);
        alumno.calcularPromedio();
        alumno.calcualarObservacion();
        alumno.obtenerNombre();
        alumno.obtenerPromedio();
        alumno.obtenerObservacion();
    }
}
