package diseñopoo;

import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de la cerveza: ");
        String nombre = teclado.nextLine();
        System.out.println("Tipo de cerveza: ");
        String tipo = teclado.nextLine();
        System.out.println("Ingrese costo: ");
        double precio = teclado.nextDouble();
        System.out.println("Número de unidades: ");
        int unidades = teclado.nextInt();

        Cerveza cerveza = new Cerveza(precio, unidades, nombre, tipo);
        cerveza.presentarDatos();

    }
}
