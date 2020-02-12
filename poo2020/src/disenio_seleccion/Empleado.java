package disenio_seleccion;

public class Empleado {
    // varibles globales
    private String nombre;
    private double horas;
    private double cuota;
    private double sueldo;

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
            sueldo = (40 * cuota) + (horas - 40) * (cuota * 2);
        }
    }

    // Métodos para las varibles
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Metodo para el nombre del empleado
    public void obtnerNombre(){
        System.out.println(nombre);
    }

    // Metodo para presentar el sueldo del empleado
    public void obtenerSueldo(){
        System.out.println(sueldo);
    }
}
