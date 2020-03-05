package polimorfismoautomotriz;

import java.util.Scanner;

public class EmpMecanico1 extends Empleado1 {
    /**
     * Método constructor de la clase EmpMecanico
     * @param nombre
     * @param departamento
     * @param puesto
     * @param trab_real
     * @param cost_trabajos
     */
    public EmpMecanico1(String nombre, String departamento, String puesto, int trab_real,double cost_trabajos){
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
        this.trab_real = trab_real;
        this.cost_trabajos = cost_trabajos;
    }

    Scanner teclado = new Scanner(System.in);
    // Variables globales
    private int trab_real;
    private double quincena;
    private double cost_trabajos;

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
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularSueldoQna() {
        for (int i = 0; i< trab_real; i++ ){
            System.out.println("Ingrese el valor del trabajo "+ (i+1) +" realizado: ");
            cost_trabajos = teclado.nextDouble();
            sueldo_quince += cost_trabajos * 0.4;
        }
    }
}
