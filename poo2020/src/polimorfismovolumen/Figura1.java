package polimorfismovolumen;

public abstract class Figura1 {

    // Varible de la clase padre
    protected String nombre;
    protected double volumen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    /**
     * Método abstracto, que será implementado
     * dentro de las clases hijas
     */

    public abstract void calcularVolumen();
}
