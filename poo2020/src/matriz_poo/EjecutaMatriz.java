package matriz_poo;
/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva, Pablo Montaño
 */
import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // entrada de datos
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = entrada.nextInt();
        System.out.println("Ingrese el numero de filas: ");
        int filas = entrada.nextInt();
        int [][] matriz = new int[filas][columnas];
        // entrada de datos en la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor de la fila #"+(i+1)+" columna #"+(j+1)+": ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        // creacion del objeto
        Transpuesta transpuesta = new Transpuesta(columnas,filas, matriz);
        // calculo de la matriz tanspuesta
        transpuesta.calcularMatrizTranspuesta();
        // presentacion de la matriz normal
        System.out.println("Matriz Normal");
        transpuesta.obtenerMatriz();
        // presentacion de la matriz tanspuesta
        System.out.println("Matriz Transpuesta");
        transpuesta.obtenerMatrizTranspuesta();
    }
}
