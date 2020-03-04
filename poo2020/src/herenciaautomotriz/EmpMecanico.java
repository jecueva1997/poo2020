package herenciaautomotriz;

public class EmpMecanico extends Empleado {

    /**
     * Método constructor de la clase EmpMecanico
     * @param nombre
     * @param departamento
     * @param puesto
     * @param trab_real
     * @param cost_trabajos
     */
    public EmpMecanico(String nombre, String departamento, String puesto, int trab_real,double cost_trabajos){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.trab_real = trab_real;
        this.setCost_trabajos(cost_trabajos);
    }

    // Variables globales
    private int trab_real;
    private double quincena;
    private double cost_trabajos;
    private double quince_tota;

    // Métodos get y set de las variables
    public int getTrab_real() {
        return trab_real;
    }

    public void setTrab_real(int trab_real) {
        this.trab_real = trab_real;
    }

    public double getQuincena() {
        return quincena;
    }

    public void setQuincena(double quincena) {
        this.quincena = quincena;
    }

    public double getCost_trabajos() {
        return cost_trabajos;
    }

    public void setCost_trabajos(double cost_trabajos) {
        this.cost_trabajos = cost_trabajos;
    }

    /**
     * Método para calcular la quince del mecánico
     * @return quince_Tota
     */
    public double calcularQuincenaMecanico(){
        for (int i=0; i<= trab_real; i++ ){
            quincena = cost_trabajos * 0.4;
            quince_tota += quincena;
        }
        return quince_tota;
    }
}
