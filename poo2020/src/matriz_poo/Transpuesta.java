package matriz_poo;
/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva, Pablo Montaño
 */
public class Transpuesta {
    // Variables globales
    private int columnas;
    private int filas;
    private int[][] matriz = new int [filas][columnas];

    // set y get de las variables
    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    // Constructor de la clase
    public Transpuesta(int columnas, int filas, int[][] matriz){
        this.columnas = columnas;
        this.filas = filas;
        this.matriz = matriz;
    }

    // metodo para calculas la transpuesta
    public int[][] calcularMatrizTranspuesta(){
        // declaracion de la matriz transpuesta
        int[][] matrizTranspuesta = new  int[columnas][filas];
        // for para llenar los valores de la transpuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }
    // presentacion de la matriz principal
    public void obtenerMatriz(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    // presentacion de la matriz transpuesta
    public void obtenerMatrizTranspuesta(){
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(calcularMatrizTranspuesta()[i][j]);
            }
            System.out.println("");
        }
    }
}
