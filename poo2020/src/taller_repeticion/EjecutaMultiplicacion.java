/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */
package taller_repeticion;

import disenio_repeticion.Empleado;

import java.util.Scanner;

public class EjecutaMultiplicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // varoble boleanda
        boolean a = true;
        String cancelar = "";

        do {
            // Datos de entrada
            System.out.println("Ingrese el primer número: ");
            int num1 = teclado.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = teclado.nextInt();
            // Creacion de un nuevo objeto
            Multiplicacion multiplicacion = new Multiplicacion(num1, num2);
            // calculo del sueldo
            multiplicacion.calcularMultiplicacion();
            // Imprimir
            multiplicacion.obtenerNumero();
            teclado.nextLine();
            System.out.println("Desea seguir calculando más números digite la palabra: si");
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
