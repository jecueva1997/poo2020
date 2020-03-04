package herenciavolumen;

public class Cono extends Figura {

    /**
     * Método constructor para la clase Cono
     * @param nombre
     * @param radio
     * @param altura
     */
    public Cono(String nombre, double radio, double altura){
        this.nombre = nombre;
        this.radio = radio;
        this.altura = altura;
    }

    //Variables globales
    private double radio;
    private double altura;
    private double volCon;


    //Métodos get y set de las variables
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

    public double getVolCon() {
        return volCon;
    }

    public void setVolCon(double volCon) {
        this.volCon = volCon;
    }

    /**
     * Método para calcular el volumen del Cono
     * @return volCon
     */
    public double calcularVolumenCono(){
        volCon = (1 * Math.PI * Math.pow(radio, 2) * altura)/3;
        return  volCon;
    }
}
