/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */
package taller_repeticion;

public class Multiplicacion {
    private int num1;
    private int num2;
    private int acumulador;

    /**
     * Metodo para obtener la variable num1
     * @return this.num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Metodo para actualizar la variable num1
     * @param num1
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * Metodo para obtener la variable num2
     * @return this.num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Metodo para actualizar la variable num2
     * @param num2
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * Metodo para obtener la variable acumulador
     * @return this.acumulador
     */
    public int getAcumulador() {
        return acumulador;
    }

    /**
     * Metodo para actualizar la variable acumulador
     * @param acumulador
     */
    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }

    /**
     * Metodo constructor para la Clase Multiplicacion
     * @param num1
     * @param num2
     */
    public Multiplicacion(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Metodo para calcular  la sumatoria de los números a multiplicar
     */
    public int calcularMultiplicacion(){
        int c = 0;
        for (int acumulador = 1; acumulador <= num2; acumulador++){
            c  += num1;
        }
        return c;
    }


    // Metodo para sacar el valor de la variable acumulador
    public void obtenerNumero(){
        System.out.println(calcularMultiplicacion());
    }

}
