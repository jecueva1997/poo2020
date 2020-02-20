package arreglos_poo;
/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */
import java.util.Scanner;
public class EjecutaSumaArreglo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // declaracion de variables
        int[] arregloA = new int[10];
        int[] arregloB = new int[10];
        int[] arregloC = new int[10];
        // Ciclo for para la lectura de cada uno de los datos
        for (int i=0; i<arregloA.length; i++){
            System.out.println("ingresar valor para arreglo a");
            arregloA[i] = teclado.nextInt();
            System.out.println("ingresar valor para arreglo b");
            arregloB[i] = teclado.nextInt();
        }
        // creacion del objeto
        SumaArreglo sumaArreglo= new SumaArreglo(arregloA,arregloB);
        // calculo de la suma
        sumaArreglo.calcularSuma();
        // presentacion de datos
        sumaArreglo.obtenerTodo();
    }
}
