package arreglos_poo;
/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */

public class Media {
    // declaracion de variables globales
    private int[] numeros = new int[15];
    private double[] desviacion = new  double[15];
    private double media;
    // establecer valores a las variables
    public Media(int[] numeros){
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public double[] getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(double[] desviacion) {
        this.desviacion = desviacion;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }


    // calculo de la media
    public void calcularMedia(){
        // inicializacion de la variable con cero
        media = 0;
        // recorrer el arreglo para sumarlo
        for (int i = 0; i < numeros.length ; i++) {
            media += numeros[i];
        }
        // valor de la media
        media /= numeros.length;
    }
    // calculo de la desviacion
    public void calculoDesviacion(){
        // ciclo para el calculo de la desviacion de cada valor
        for (int i = 0; i < numeros.length; i++){
            // asignacion de la desvicion por cada posicion
            desviacion[i] = numeros[i] - media;
        }
    }

    // metodo para la presentacion de datos
    public void presentarDatos() {
        // cabecera que se presentara al usuario
        System.out.println("NÚMEROS   DESVIACIÓN\n--------------------");
        // ciclo for para presentar el numero y su desviacion
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("  " + numeros[i] + "      " + desviacion[i]);
        }
        // presentacion de la media
        System.out.println("MEDIA = "+media);
    }
}
