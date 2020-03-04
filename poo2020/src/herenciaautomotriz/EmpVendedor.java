package herenciaautomotriz;

public class EmpVendedor extends Empleado {

    /**
     * Método constructor de la clase EmpVendedor
     * @param nombre
     * @param departamento
     * @param puesto
     * @param vent_real
     * @param precAuto
     */
    public EmpVendedor(String nombre, String departamento, String puesto, int vent_real, double precAuto){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.vent_real = vent_real;
        this.setPrecAuto(precAuto);
    }

    // Variables globales
    private double sal_min = 500;
    private int vent_real;
    private double precAuto;
    private double quincena;
    private double quincena_Tota;

    // Métodos get y set de las variables
    public double getSal_min() {
        return sal_min;
    }

    public void setSal_min(double sal_min) {
        this.sal_min = sal_min;
    }

    public int getVent_real() {
        return vent_real;
    }

    public void setVent_real(int vent_real) {
        this.vent_real = vent_real;
    }

    public double getQuincena() {
        return quincena;
    }

    public void setQuincena(double quincena) {
        this.quincena = quincena;
    }

    public double getPrecAuto() {
        return precAuto;
    }

    public void setPrecAuto(double precAuto) {
        this.precAuto = precAuto;
    }

    public double getQuincena_Tota() {
        return quincena_Tota;
    }

    public void setQuincena_Tota(double quincena_Tota) {
        this.quincena_Tota = quincena_Tota;
    }

    /**
     * Metodo para calcular la quincena del vendedor
     * @return quincena_Tota
     */
    public double calcularQuincenaVendedor(){
        for(int i = 0; i<vent_real; i++){
            quincena = sal_min + (precAuto * 0.02);
            quincena_Tota += quincena;
        }
        return quincena_Tota;
    }
}
