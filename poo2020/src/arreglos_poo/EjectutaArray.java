package arreglos_poo;

import java.util.Scanner;

public class EjectutaArray {
    public static void main(String[] args) {
        // Scanner
        Scanner teclado = new Scanner(System.in);
        // Variables
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        // Mensaje para poner los datos del vector A
        System.out.println("Ingrese valores para el arreglo A: ");
        // Ciclo for para ir poniendo los datos del vector A
        for (int i = 0; i< vectorA.length; i++){
            vectorA[i] = teclado.nextInt();
        }

        // Mensaje para poner los datos del vector b
        System.out.println("Ingrese valores para el arreglo B: ");
        // Ciclo for para ir poniendo los datos del vector b
        for (int i = 0; i< vectorB.length; i++){
            vectorB[i] = teclado.nextInt();
        }

        // Creacion de un nuevo objeto
        Array array = new Array(vectorA, vectorB );
        // Se llama al calculo de las variabes
        array.calcularSumatoriaProducto();
        // Presentacion de los datos del vector A
        array.obtenerVectorA();
        // Presentacion de los datos del vector B
        array.obtenerVectorB();
        // Presentacion del dato de la operacion
        array.obterSumatoriaProducto();
    }
}
