package arreglos_poo;

public class Array {
    // variables globales
    private int[] vectorA = new int[10];
    private int[] vectorB = new int[10];
    private int sumatoria_producto;

    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int getSumatoria_producto() {
        return sumatoria_producto;
    }

    public void setSumatoria_producto(int sumatoria_producto) {
        this.sumatoria_producto = sumatoria_producto;
    }

    /**
     *
     * @param vectorA
     * @param vectorB
     */
    public Array(int[] vectorA, int[] vectorB){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    /**
     * Metodo para calcular la sumatoria de los productos del array
     */
    public void calcularSumatoriaProducto(){
        for (int i = 0; i < getVectorA().length; i++){
            sumatoria_producto = sumatoria_producto + (vectorA[i] * vectorB[i]);
        }
    }

    /**
     * Metodo para sacar las datos del vector A
     */
    public void obtenerVectorA(){
        for (int i = 0; i< vectorA.length; i++){
            System.out.print(vectorA[i]);
        }
        System.out.println("");
    }

    /**
     * Metodo para sacar los datos del vector B
     */
    public void obtenerVectorB(){
        for (int i = 0; i< vectorB.length; i++){
            System.out.print(vectorB[i]);
        }
        System.out.println("");
    }

    /**
     * Metodo para sacar el calculo
     */
    public void obterSumatoriaProducto(){
        System.out.println(sumatoria_producto);
    }
}
