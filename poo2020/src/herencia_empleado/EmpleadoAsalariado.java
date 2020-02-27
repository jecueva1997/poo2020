package herencia_empleado;

public class EmpleadoAsalariado extends Empleado {
    /**
     * Metodo constructor
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param val_mensual
     */
    public EmpleadoAsalariado(String nombre, String cargo, String dependencia, double val_mensual){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.val_mensual = val_mensual;
    }

    // varibles
    private double val_mensual;

    // Métodos get y set
    public double getVal_mensual() {
        return val_mensual;
    }

    public void setVal_mensual(double val_mensual) {
        this.val_mensual = val_mensual;
    }
}
