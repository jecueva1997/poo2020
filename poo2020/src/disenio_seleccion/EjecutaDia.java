package disenio_seleccion;

import java.util.Scanner;

public class EjecutaDia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Ingreso de datos por teclado
        System.out.println("Ingrese el numero de día: ");
        int numero = teclado.nextInt();

        // Llamo a una nueva varible para la clase Dia
        Dia dia = new Dia(numero);
        // Llamo al calculo del nombre
        dia.calcularNombre();
        // Presentacion del día
        System.out.println(dia.obtenerNombre());
    }
}
