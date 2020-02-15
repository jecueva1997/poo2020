package disenio_repeticion;

public class Empleado {
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
    public Empleado(String nombre, double horas, double cuota){
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
            sueldo = (40 * cuota) * (horas - 40) * (cuota * 2);
        }
    }

    public void obtenerCuota(){
        ;
    }
    // Metodo para mostrar el nombre y sueldo del empleado
    public void obtenerNombre(){
        System.out.println(nombre);
    }

    public void obtenerSueldo(){
        System.out.println(sueldo);
    }
}
