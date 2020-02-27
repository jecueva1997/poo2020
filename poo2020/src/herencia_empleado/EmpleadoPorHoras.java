package herencia_empleado;
/**
 * Clase que hereda de la clase Empleado
 * Contendra todos los atributos y metodos definidos en Empleado
 */
public class EmpleadoPorHoras extends Empleado{
    /**
     * Metodo constructor
     * @param nombre
     * @param cargo
     * @param dependencia
     * @param hora
     * @param valorHora
     */
    public EmpleadoPorHoras(String nombre, String cargo, String dependencia, int hora, double valorHora){
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
        this.hora= hora;
        this.valorHora = valorHora;
    }

    // variables
    private int hora;
    private double valorHora;
    private double sueldo;

    // Métodos get y set
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Metodo para calcular el sueldo
     * @return sueldo
     */
    public double CalcularSueldoHoras(){
        sueldo = (hora * valorHora);
        return sueldo;
    }

}
