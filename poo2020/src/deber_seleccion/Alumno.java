package deber_seleccion;

public class Alumno {
    // variables globales
    private String nombre;
    private double calific1;
    private double calific2;
    private double calific3;
    private double calific4;
    private double promedio;
    private String observacion;

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
     * Metodo para obtener la variable calific1
     * @return this.calific1
     */
    public double getCalific1() {
        return calific1;
    }

    /**
     * Metodo para actualizar la variable calific1
     * @param calific1
     */
    public void setCalific1(double calific1) {
        this.calific1 = calific1;
    }

    /**
     * Metodo para obtener la variable calific2
     * @return this.calic2
     */
    public double getCalific2() {
        return calific2;
    }

    /**
     * Metodo para actualizar la variable calific2
     * @param calific2
     */
    public void setCalific2(double calific2) {
        this.calific2 = calific2;
    }

    /**
     * Metodo para obtener la variable calific3
     * @return this.calific3
     */
    public double getCalific3() {
        return calific3;
    }

    /**
     * Metodo para actualizar la variable calific3
     * @param calific3
     */
    public void setCalific3(double calific3) {
        this.calific3 = calific3;
    }

    /**
     * Metodo para obtener la variable calific4
     * @return this.calific4
     */
    public double getCalific4() {
        return calific4;
    }

    /**
     * Metodo para actualizar la variable calific4
     * @param calific4
     */
    public void setCalific4(double calific4) {
        this.calific4 = calific4;
    }

    /**
     * Metodo para obtener la variable promedio
     * @return this.promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Metodo para actualizar la variable promedio
     * @param promedio
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    /**
     * Metodo para obtener la variable observacion
     * @return this.observacion
     */
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /**
     * Metodo constructor para la clase Alumno
     * @param nombre
     * @param calific1
     * @param calific2
     * @param calific3
     * @param calific4
     */
    public Alumno(String nombre, double calific1, double calific2, double calific3, double calific4){
        this.nombre = nombre;
        this.calific1 = calific1;
        this.calific2 = calific2;
        this.calific3 = calific3;
        this.calific4 = calific4;
    }

    /**
     * Método para obtener el valor de la varible promedio
     * @return promedio
     */
    public void calcularPromedio(){
        promedio = (calific1 + calific2 + calific3 + calific4)/4;
    }

    /**
     * Método para obtener el valor de la varible observacion
     * @return observacion
     */

    public void calcualarObservacion(){
        if (promedio >= 60){
            observacion = "Aprovado";
        }else{
            observacion = "Reprovado";
        }
    }

    // Métodos para sacar el nombre, promedio y el estado de la materia
    public void obtenerNombre(){
        System.out.println("Nombre: "+nombre);
    }

    public void obtenerPromedio(){
        System.out.println("Promedio: "+promedio);
    }

    public void obtenerObservacion(){
        System.out.println("Estado: "+observacion);
    }
}
