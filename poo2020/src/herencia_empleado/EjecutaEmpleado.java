package herencia_empleado;

import herencia.Estudiante;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, cargo, dependecia;
        int horas;
        double valorHora, valorMensual;
        // Menú para ingreso de datos
        System.out.println("----------------- Empleado -------------------------------");
        System.out.println(" Digitar 1: para presentar sueldo de empleado por hora   ");
        System.out.println(" Digitar 2: para presentar sueldo de empleado mensual ");
        System.out.println("-----------------------------------------------------------");
        int op = teclado.nextInt();
        // Opciones de datos
        switch (op) {
            case 1:
                System.out.println("Ingrese el nombre: ");
                teclado.nextLine();
                nombre = teclado.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = teclado.nextLine();
                System.out.println("Ingrese depemdemcia: ");
                dependecia = teclado.nextLine();
                System.out.println("Ingrese las horas trabajadas: ");
                horas = teclado.nextInt();
                System.out.println("Ingrese el valor por hora trabajada: ");
                valorHora = teclado.nextDouble();
                EmpleadoPorHoras empleadoHoras = new EmpleadoPorHoras(nombre, cargo, dependecia, horas, valorHora);

                System.out.println("------------------------------");
                System.out.println("Datos empleado por horas");
                System.out.println("Nombre: " +empleadoHoras.getNombre());
                System.out.println("Cargo: " +empleadoHoras.getCargo());
                System.out.println("Dependencia: " +empleadoHoras.getDependencia());
                System.out.println("Sueldo: " +empleadoHoras.CalcularSueldoHoras());
                break;

            case 2:
                System.out.println("Ingrese el nombre: ");
                teclado.nextLine();
                nombre = teclado.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = teclado.nextLine();
                System.out.println("Ingrese dependencia: ");
                dependecia = teclado.nextLine();
                System.out.println("Ingrese valor mensual: ");
                valorMensual = teclado.nextDouble();
                EmpleadoAsalariado empleadoAsa = new EmpleadoAsalariado(nombre, cargo, dependecia, valorMensual);

                System.out.println("------------------------------");
                System.out.println("Datos empleado por valor mensual");
                System.out.println("Nombre: " +empleadoAsa.getNombre());
                System.out.println("Cargo: " +empleadoAsa.getCargo());
                System.out.println("Dependencia: " +empleadoAsa.getDependencia());
                System.out.println("Sueldo: " +empleadoAsa.getVal_mensual());

                break;
            default:
                System.out.println("No existe la opción");
        }

    }
}
