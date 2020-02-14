/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */
package taller_repeticion;

public class Division {
    private int dividendo;
    private int divisor;
    int cont;

    /**
     * Metodo constructor de la clase Division
     * @param dividendo
     * @param divisor
     */
    public Division (int dividendo, int divisor){
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    /**
     * Metodo para calcular la division
     */
    public void calcular_division (){
        for (cont = 0; dividendo >= divisor; cont++) {
            dividendo = dividendo - divisor;
        }
    }

    /**
     * metodo para obtener el resultado de la division
     * @return
     */
    public int obteber_division () {
        return cont;
    }
}
