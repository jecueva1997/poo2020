package arreglos_poo;
/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */
public class SumaArreglo {
    private int[] arregloA = new int[10];
    private int[] arregloB = new int[10];
    private int[] arregloC = new int[10];

    /**
     * Metodo constructor de la clase SumaArreglo
     * @param arregloA
     * @param arregloB
     */
    public SumaArreglo(int arregloA[], int arregloB[]) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }
    //Métodos para establecer y obtener los arreglos
    public int[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(int[] arregloA) {
        this.arregloA = arregloA;
    }

    public int[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(int[] arregloB) {
        this.arregloB = arregloB;
    }

    public int[] getArregloC() {
        return arregloC;
    }

    public void setArregloC(int[] arregloC) {
        this.arregloC = arregloC;
    }

    /**
     * Método para calcular la suma de los arreglos
     */
    public void calcularSuma (){
        for (int i = 0; i < arregloA.length; i++) {
            arregloC[i] = arregloA[i] + arregloB[i];
        }
    }

    /**
     * Método que permite presentar los arreglos con la suma
     */
    public void obtenerTodo () {
        System.out.print("Arreglo 1  +  Arreglo 2  =  Arreglo 3");
        System.out.println("");
        System.out.print("_____________________________________");
        System.out.println("");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("    " + arregloA[i] + "             " + arregloB[i] + "             " + arregloC[i]);
        }
    }
}
