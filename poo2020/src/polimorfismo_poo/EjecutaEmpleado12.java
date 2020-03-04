package polimorfismo_poo;

import java.util.Scanner;

public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Obtener el sueldo quincenal de una empleado por horas
        EmpleadoPorHoras2 empHoras = new EmpleadoPorHoras2();
        System.out.println("Cálculo sueldo quincenal empleado por horas");
        System.out.println("Ingrese las horas trabajadas");
        empHoras.setHorasTrab(teclado.nextInt());
        System.out.println("Ingrese las cuotas por hora");
        empHoras.setCuotaHora(teclado.nextDouble());
        empHoras.calcularSueldoQna();
        System.out.println("Sueldo quincenal es: " + empHoras.getSueldo());

        System.out.println("Cálculo sueldo quincenal empleado por horas");
        EmpleadoAsalariado2 empAsalariado = new EmpleadoAsalariado2();
        System.out.println("Ingrese sueldo inicial");
        empAsalariado.setSueldoMensual(teclado.nextDouble());
        empAsalariado.calcularSueldoQna();
        System.out.println("Sueldo quincenal es: " + empAsalariado.getSueldo());
    }
}
