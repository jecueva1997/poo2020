package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // entrada de datos
        System.out.println("Ingrese su numero de cedula: ");
        int cedula = entrada.nextInt();
        // creacion del objeto
        Cedula cedula1 = new Cedula(cedula);
        // calculo de la validacion
        cedula1.validacion();
        // presentacion de datos
        cedula1.obtenerCedula();
        cedula1.obtenerValidador();
        cedula1.obtenerEstado();
    }
}
