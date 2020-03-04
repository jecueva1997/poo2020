package polimorfismo_figura;

public class Triangulo3 extends Figura3{

    // Atributos propios de la clase
    private double baseTriang;
    private double alturaTriang;

    public void setBaseTriang(double baseTriang) {
        this.baseTriang = baseTriang;
    }


    public void setAlturaTriang(double alturaTriang) {
        this.alturaTriang = alturaTriang;
    }

    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = (baseTriang * alturaTriang)/2;
    }
}
