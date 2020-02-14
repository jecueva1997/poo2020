/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */
package taller_repeticion;

import java.util.Scanner;
public class EjecutaDivision {
    public static void main(String[] args) {
        String opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Desea realizar una division a traves de restas repetitivas si/no");
        opcion = teclado.nextLine();

        while (opcion.equals("si")) {
            System.out.println("Ingresar dividendo");
            int dividendo = teclado.nextInt();
            System.out.println("Ingresar divisor");
            int divisor = teclado.nextInt();

            Division division = new Division(dividendo, divisor);
            division.calcular_division();
            System.out.println("El resultado de la division es: " + division.obteber_division());
            teclado.nextLine();
            System.out.println("Desea seguir realizando division a traves de restas repetitivas si/no");
            opcion = teclado.nextLine();
        }
    }
}
