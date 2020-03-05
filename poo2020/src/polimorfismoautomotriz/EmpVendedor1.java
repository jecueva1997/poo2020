package polimorfismoautomotriz;

import java.util.Scanner;

public class EmpVendedor1 extends Empleado1 {
    /**
     * Método constructor de la clase EmpVendedor
     * @param nombre
     * @param departamento
     * @param puesto
     * @param vent_real
     * @param precAuto
     */
    public EmpVendedor1(String nombre, String departamento, String puesto, int vent_real, double precAuto){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.setVent_real(vent_real);
        this.setPrecAuto(precAuto);
    }

    Scanner teclado = new Scanner(System.in);

    // Variables globales
    private double sal_min = 500;
    private int vent_real;
    private double precAuto;
    private double quincena;

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

    public double getPrecAuto() {
        return precAuto;
    }

    public void setPrecAuto(double precAuto) {
        this.precAuto = precAuto;
    }

    public double getQuincena() {
        return quincena;
    }

    public void setQuincena(double quincena) {
        this.quincena = quincena;
    }

    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularSueldoQna() {
        for(int i = 0; i<vent_real; i++){
            System.out.println("Ingrese el valor del Auto "+ i);
            precAuto = teclado.nextDouble();
            quincena = sal_min + (precAuto * 0.02);
            sueldo_quince += quincena;
        }
    }
}
