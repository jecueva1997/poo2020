package polimorfismovolumen;

public class Esfera1 extends Figura1 {

    /**
     * Método constructor para la clase Esfera
     * @param nombre
     * @param radio
     */
    public Esfera1(String nombre, double radio){
        this.nombre = nombre;
        this.setRadio(radio);
    }

    // Variables globales
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularVolumen() {
        volumen = (4 * Math.PI * Math.pow(radio, 3)/3);
    }
}
