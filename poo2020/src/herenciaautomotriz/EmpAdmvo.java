package herenciaautomotriz;

public class EmpAdmvo extends Empleado{

    /**
     * Método constructor de la clase EmpAdmvo
     * @param nombre
     * @param departamento
     * @param puesto
     * @param sueldo
     */
    public EmpAdmvo(String nombre, String departamento, String puesto, double sueldo){
        this.nombre = nombre;
        this. departamento = departamento;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    // Variables globales
    private double sueldo;
    private double quincena;

    //Métodos get y set de las variables
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getQuincena() {
        return quincena;
    }

    public void setQuincena(double quincena) {
        this.quincena = quincena;
    }

    /**
     * Método para calcular la quincena del Administrativo
     * @return quincena
     */
    public double calcularQuincenaAdmvo(){
        quincena = sueldo / 2;
        return quincena;
    }
}
