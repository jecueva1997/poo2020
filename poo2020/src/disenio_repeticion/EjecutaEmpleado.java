package disenio_repeticion;


import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // dato unico
        System.out.println("Ingrese el valor del valor de la hora");
        double cuota = teclado.nextDouble();
        teclado.nextLine();
        // varoble boleanda
        boolean a = true;
        String cancelar = "";

        do {
            // Datos de entrada
            System.out.println("Ingrese el nombre: ");
            String nombre = teclado.nextLine();
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
            System.out.println("Dese seguir calculando el sueldo de más empleados digite la palabra: si");
            cancelar = teclado.nextLine();
            //  Condicion para establecer el limite de empleados
            if (cancelar.equals("si")){
                    a = true;
            }else {
                a = false;
            }
        }while (a == true);
    }
}
