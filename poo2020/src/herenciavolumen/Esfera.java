package herenciavolumen;

public class Esfera extends Figura{

    /**
     * Método constructor para la clase Esfera
     * @param nombre
     * @param radio
     */
    public Esfera(String nombre, double radio){
        this.nombre = nombre;
        this.radio = radio;
    }

    // Variables globales
    private double radio;
    private double volEsf;

    // Métodos get y set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getVolEsf() {
        return volEsf;
    }

    public void setVolEsf(double volEsf) {
        this.volEsf = volEsf;
    }

    /**
     * Método para calcular el volumen de la Esfera
     * @return volEsf
     */
    public double calcularVolumenEsfera(){
        volEsf = (4 * Math.PI * Math.pow(radio, 3)/3);
        return volEsf;
    }
}
