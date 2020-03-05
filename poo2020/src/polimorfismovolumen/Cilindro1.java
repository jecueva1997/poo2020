package polimorfismovolumen;

public class Cilindro1 extends Figura1 {
    /**
     * Método cosntructor para la clase Cilindro
     * @param nombre
     * @param radio
     * @param altura
     */
    public Cilindro1(String nombre, double radio, double altura){
        this.nombre = nombre;
        this.setRadio(radio);
        this.setAltura(altura);
    }

    // variables globales
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
        volumen = Math.PI * (Math.pow(radio, 2) * altura);
    }
}
