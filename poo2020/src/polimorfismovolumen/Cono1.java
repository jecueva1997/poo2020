package polimorfismovolumen;

public class Cono1 extends Figura1{
    /**
     * Método constructor para la clase Cono
     * @param nombre
     * @param radio
     * @param altura
     */
    public Cono1(String nombre, double radio, double altura){
        this.nombre = nombre;
        this.setRadio(radio);
        this.setAltura(altura);
    }

    //Variables globales
    private double radio;
    private double altura;

    // Métodos get y set de las variables
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularVolumen() {
        volumen = (1 * Math.PI * Math.pow(radio, 2) * altura)/3;
    }
}
