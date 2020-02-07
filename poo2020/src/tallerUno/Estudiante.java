package tallerUno;

public class Estudiante {
    // definición de atributos de forma global
    private String nombre;
    private int edad;
    private String carrera;
    private String ciclo;
    private String genero;

    // definición de métodos

    /**
     * Método para obtener el valor de la varible nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Método para obtener el valor de la varible edad
     * @return this.edad
     */
    public int obtener_edad(){
        return edad;
    }

    /**
     * Método para obtener el valor de la varible carrera
     * @return this.carrera
     */
    public String obtener_carrera(){
        return carrera;
    }

    /**
     * Método para obtener el valor de la varible ciclo
     * @return this.ciclo
     */
    public String obtener_ciclo(){
        return ciclo;
    }

    /**
     * Método para obtener el valor de la varible genero
     * @return this.genero
     */
    public String obtener_genero(){
        return genero;
    }

    /**
     * Método para obtener el valor de la varible tiempo
     * @return tiempo
     */
    // concatenación de cadena con método
    public String obtener_estudiante(){
        String estudiante = "estudiar";
        return estudiante;
    }


    /**
     * Método para obtener el valor de la varible tiempo
     * @return tiempo
     */
    // concatenación de cadena con método
    public String obtener_estudiante1(){
        String estudiante1 = "aprender";
        return estudiante1;
    }

    /**
     * Método para actualiza el valor de la varible nombre
     * @param  nombre
     */
    public void actualizar_nombre(String nombre){
        // con el thist hacemos referencia a variables globales
        this.nombre = nombre;
    }

    /**
     * Método para actualizar el valor de la varible edad
     * @param  edad
     */
    public void actualizar_edad(int edad){
        this.edad = edad;
    }

    /**
     * Método para actualizar el valor de la varible carrera
     * @param  carrera
     */
    public void actualizar_carrera(String carrera){
        this.carrera = carrera;
    }

    /**
     * Método para actualizar el valor de la varible ciclo
     * @param  ciclo
     */
    public void actualizar_ciclo(String ciclo){
        this.ciclo = ciclo;
    }

    /**
     * Método para actualizar el valor de la varible genero
     * @param  genero
     */
    public void actualizar_genero(String genero){
        this.genero = genero;
    }
}
