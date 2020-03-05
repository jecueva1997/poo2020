package polimorfismoautomotriz;

public abstract class Empleado1 {

    // Variables de la clase padre
    protected String nombre;
    protected String departamento;
    protected String puesto;
    protected double sueldo_quince;

    // Métodos get y set de las variables
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo_quince() {
        return sueldo_quince;
    }

    public void setSueldo_quince(double sueldo_quince) {
        this.sueldo_quince = sueldo_quince;
    }

    /**
     * Método abstracto, que será implementado
     * dentro de las clases hijas
     */
    public abstract void calcularSueldoQna();
}
