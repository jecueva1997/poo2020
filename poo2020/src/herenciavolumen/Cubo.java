package herenciavolumen;

public class Cubo extends Figura {

    /**
     * Método constructor para la clase Cubo
     * @param nombre
     * @param arista
     */
    public Cubo(String nombre, double arista){
        this.nombre = nombre;
        this.arista = arista;
    }

    // Variables globales
    private double arista;
    private double volCub;

    // Métodos get y set de las variables
    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    /**
     * Método para calcular el volumen del Cubo
     * @return
     */
    public double calcularVolumenCubo(){
        volCub = Math.pow(arista, 3);
        return volCub;
    }


}
