package herenciaautomotriz;

public class Empleado {

    // Variables de la clase padre
    protected String nombre;
    protected String departamento;
    protected String puesto;

    // Métodos get y set de la variables
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
}
