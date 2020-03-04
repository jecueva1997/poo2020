package polimorfismo_figura;

public class Circulo3 extends Figura3 {

    // Atributos propios de la clase
    private double radioCir;


    public void setRadioCir(double radioCir) {
        this.radioCir = radioCir;
    }


    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = 3.14 * radioCir;
    }
}
