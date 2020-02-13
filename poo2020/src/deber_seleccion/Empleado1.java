package deber_seleccion;

public class Empleado1 {
    // varibles globales
    private String nombre;
    private double horas;
    private double cuota;
    private double sueldo;

    /**
     * Metodo para obtener la variable nombre
     * @return this.nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar la variable nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la variable horas
     * @return this.horas
     */
    public double getHoras() {
        return horas;
    }

    /**
     * Metodo para actualizar la variable horas
     * @param horas
     */
    public void setHoras(double horas) {
        this.horas = horas;
    }

    /**
     * Metodo para obtener la variable cuota
     * @return this.cuota
     */
    public double getCuota() {
        return cuota;
    }

    /**
     * Metodo para actualizar la variable cuota
     * @param cuota
     */
    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    /**
     * Metodo para obtener la variable sueldo
     * @return this.sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Metodo para actualizar la variable sueldo
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Metodo constructor para la Clase Empleado1
     * @param nombre
     * @param horas
     * @param cuota
     */
    public Empleado1(String nombre, double horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
    }

    /**
     * Método para obtener el valor de la varible sueldo
     * @return sueldo
     */

    public void calcularSueldo(){
        if(horas <= 40){
            sueldo = horas * cuota;
        }else{
            if (horas <= 50){
                sueldo = (40 * horas) + ((horas - 40) * (cuota * 2));
            }else{
                sueldo = (40 * horas) + (10 * cuota * 2) + ((horas - 50) * (cuota * 3));
            }
        }
    }

    // Metodo para mostrar el nombre y sueldo del empleado
    public void obtenerNombre(){
        System.out.println("Nombre: " +nombre);
    }

    public void obtenerSueldo(){
        System.out.println("El sueldo es de: $" +sueldo);
    }
}
