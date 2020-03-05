package polimorfismoautomotriz;

public class EmpAdmvo1 extends Empleado1 {

    /**
     * Método constructor de la clase EmpAdmvo
     * @param nombre
     * @param departamento
     * @param puesto
     * @param sueldo
     */
    public EmpAdmvo1(String nombre, String departamento, String puesto, double sueldo){
        this.nombre = nombre;
        this. departamento = departamento;
        this.puesto = puesto;
        this.setSueldo(sueldo);
    }

    // Variables globales
    private double sueldo;

    // Método gey y set de las varibales
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularSueldoQna() {
        sueldo_quince = sueldo / 2;
    }
}
