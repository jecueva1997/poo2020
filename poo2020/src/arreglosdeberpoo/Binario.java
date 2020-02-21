package arreglosdeberpoo;

public class Binario {
    //variables globales
    private String numero;
    private int decimal;
    int[] binarioDecimal = new int[6];

    /**
     * Metodo para obtener la variable numero
     * @return this.numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Metodo para actualizar la variable numero
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Metodo para obtener la variable decimal
     * @return this.decimal
     */
    public int getDecimal() {
        return decimal;
    }

    /**
     * Metodo para actualizar la variable decimal
     * @param decimal
     */
    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    /**
     * Metodo del constructo de la clase Binario
     * @param numero
     */
    public Binario(String numero){
        this.numero = numero;
    }


    /**
     * Metodo para devolver la variable decimal
     */

    public void calcularNumeroDecimal(){
        // transformacion de datos
        int binario1 = Integer.parseInt(numero);
        // contador
        int c = 5;
        // ciclo para almacenar los datos uno por uno
        for (int i = 0; i < binarioDecimal.length ; i++) {
            // formula para obtener el ultimo valor del arreglo
            binarioDecimal[c] = (int)((binario1/Math.pow(10, i)) %10);
            // decrementa el contador
            c--;
        }
        // asignacion de un contador que va a decrecer
        c = 5;
        // for para calcular el valor decimal de cada digito
        for (int i = 0; i < binarioDecimal.length; i++) {
            // suma de los resultados
            decimal += (binarioDecimal[i] * Math.pow(2, c));
            // decremento del contador
            c--;
        }
    }

    public int obtenerNumerDecimal() {
        return decimal;
    }

    // metodo para la presentacion de datos
    public void obtenerSuma(){
        // impresion del resultado
        System.out.println(numero+" en binario = "+ decimal +" en decimal");
    }

}
