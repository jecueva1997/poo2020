package polimorfismo_poo;

public class EmpleadoPorHoras2 extends Empleado12{

    // Atributos propios de la clase
    private double cuotaHora;
    private int horasTrab;


    // Tambien se extienden los atributos de la clase padre
    public void setCuotaHora(double cuotaHora) {
        this.cuotaHora = cuotaHora;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularSueldoQna() {
        sueldo = horasTrab * cuotaHora;
    }

}
