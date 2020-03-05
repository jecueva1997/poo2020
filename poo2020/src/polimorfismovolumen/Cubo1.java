package polimorfismovolumen;

public class Cubo1 extends Figura1 {
    /**
     * Método constructor para la clase Cubo
     * @param nombre
     * @param arista
     */
    public Cubo1(String nombre, double arista){
        this.nombre = nombre;
        this.setArista(arista);
    }

    // Variables globales
    private double arista;

    // Métodos get y set de las variables
    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularVolumen() {
        volumen = Math.pow(arista, 3);
    }
}
