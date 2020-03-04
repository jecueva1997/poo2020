package polimorfismo_figura;

public class Cuadrado3 extends Figura3 {

    // Atributos propios de la clase
    private double ladoCuad;


    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }


    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = ladoCuad * ladoCuad;
    }
}
