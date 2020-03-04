package polimorfismo_figura;

public class Reactangulo3 extends Figura3 {

    // Atributos propios de la clase
    private double baseRecta;
    private double alturaRecta;


    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }


    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularArea() {
        area = baseRecta * alturaRecta;
    }
}
