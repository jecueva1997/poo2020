package herenciavolumen;

public class Cilindro extends Figura {

    /**
     * Método cosntructor para la clase Cilindro
     * @param nombre
     * @param radio
     * @param altura
     */
    public Cilindro(String nombre, double radio, double altura){
        this.nombre = nombre;
        this.radio = radio;
        this.altura = altura;
    }

    // variables globales
    private double radio;
    private double altura;
    private double volCil;

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

    public double getVolCil() {
        return volCil;
    }

    public void setVolCil(double volCil) {
        this.volCil = volCil;
    }

    /**
     * Metodo para calcular el volumen del Cilindro
     * @return volCil
     */
    public double calcularVolumenCilindro(){
        volCil = Math.PI * (Math.pow(radio, 2) * altura);
        return volCil;
    }
}
