package polimorfismo_figura;

public abstract class Figura3 {

    // Atribuos protegidos de la clase padre
    protected String nomFigura;
    protected double area;

    public String getNomFigura() {
        return nomFigura;
    }

    public void setNomFigura(String nomFigura) {
        this.nomFigura = nomFigura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Método abstracto, que será implementado
     * dentro de las clases hijas
     */
    public abstract void calcularArea();
}
