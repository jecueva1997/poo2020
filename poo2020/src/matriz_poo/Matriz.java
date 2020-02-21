package matriz_poo;
/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva, Pablo Montaño
 */
public class Matriz {
    // declaracion de variables globales
    private int[][] a = new int[3][3];
    private int[][] b = new int[3][3];
    private int[][] c= new int[3][3];

    /**
     * Metodo para obtener la variable a
     * @return this.a
     */
    public int[][] getA() {
        return a;
    }

    /**
     * Metodo para actualizar la variable a
     * @param a
     */
    public void setA(int[][] a) {
        this.a = a;
    }

    /**
     * Metodo para obtener la variable b
     * @return this.b
     */
    public int[][] getB() {
        return b;
    }

    /**
     * Metodo para actualizar la variable b
     * @param b
     */
    public void setB(int[][] b) {
        this.b = b;
    }

    /**
     * Metodo para obtener la variable c
     * @return this.c
     */
    public int[][] getC() {
        return c;
    }

    /**
     * Metodo para actualizar la variable c
     * @param c
     */
    public void setC(int[][] c) {
        this.c = c;
    }

    /**
     * Metodo constructor de la clase Matriz
     * @param a
     * @param b
     */
    public Matriz(int[][] a, int[][] b){
        this.a = a;
        this.b = a;
    }

    /**
     * Metodo para calcular y hacer la suma  de las 2 matrices
     * @return c
     */
    public int[][] calcularSuma(){
        int d=0;
        for (int i = 0; i < a.length ; i++){
            for(int j = 0; j < b.length ; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    /**
     * Metodo para sacar los datos de las matrices
     * @param array
     */
    public void obtenerMatriz( int[][] array){

        for (int i = 0; i < array.length ; i++){
            for (int j = 0; j < array.length ; j++){
                System.out.print(array[i][j] + "" );
            }
            System.out.println("");

        }
    }

}
