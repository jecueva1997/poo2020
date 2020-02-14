/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */
package taller_repeticion;

import java.util.Scanner;
public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del socio: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingresar el saldo inicial de la cuenta");
        int saldo_inicial = teclado.nextInt();
        teclado.nextLine();
        //Creacion del objeto
        Cajero cajero = new Cajero(saldo_inicial);

        int op = 0;

        while (op != 4) {

            System.out.println("-- CAJERO AUTOMATICO UTPL --");
            System.out.println("| Digitar 1: para retirar   |");
            System.out.println("| Digitar 2: para depositar |");
            System.out.println("| Digitar 3: para consultar |");
            System.out.println("| Digitar 4: para salir     |");
            System.out.println("-----------------------------");

            op = teclado.nextInt();
            teclado.nextLine();
            switch (op) {
                case 1:
                    System.out.println("ingresar valor a retirar");
                    int valor_retiro = teclado.nextInt();
                    teclado.nextLine();
                    cajero.retirar(valor_retiro);
                    System.out.println("Saldo contable: " + cajero.consultar_saldo());
                    break;

                case 2:
                    System.out.println("Ingresar valor a depositar");
                    int valor_depositar = teclado.nextInt();
                    teclado.nextLine();
                    cajero.depositar(valor_depositar);
                    System.out.println("Saldo contable: " + cajero.consultar_saldo());
                    break;

                case 3:
                    System.out.println("Saldo de la  cuenta:" + cajero.consultar_saldo());
                    break;

                case 4:
                    System.out.println("Gracias por preferirnos");
                    break;
                default:
                    System.out.println("no existe opcion ingresada");

            }

        }
    }
}
