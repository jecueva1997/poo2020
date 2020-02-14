/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */
package taller_repeticion;

public class Factorial {
    // variables globales
    private int num;
    private int factorial = 1;

    /**
     * Metodo para constructor de la clase Factoriañ
     * @param num
     */
    public Factorial(int num){
        this.num = num;
    }
    // metodos para la entrada de los datos
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFacrorial() {
        return factorial;
    }

    public void setFacrorial(int facrorial) {
        this.factorial = facrorial;
    }
    // metodo para calcular el factorial
    public void calculaFactorial(){
        // ciclo repetitivo para que el valor vaya incrementando
        for (int c = 1; c <= num; c++){
            factorial *= c;
        }
    }
    // metodo para obtener el factorial
    public int obtenerFactorial(){
        return factorial;
    }
}
