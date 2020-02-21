package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaBinario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // entrada de datos
        System.out.println("Ingrese un numero binario de 6 digitos");
        String numero = teclado.nextLine();
        // creacion del objeto
        Binario binario = new Binario(numero);
        // calculo del decimal
        binario.calcularNumeroDecimal();
        // presentacion de datos
        binario.obtenerSuma();
    }
}
