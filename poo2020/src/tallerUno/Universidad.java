package tallerUno;

public class Universidad {
    // definición de atributos de forma global
    private String direccion;
    private String carrera;
    private String area;
    private String docente;

    // definición de métodos

    /**
     * Método para obtener el valor de la varible direccion
     * @return this.direccion
     */
    public String obtener_direccion(){
        return direccion;
    }

    /**
     * Método para obtener el valor de la varible carrera
     * @return this.carrera
     */
    public String obtener_carrera(){
        return carrera;
    }

    /**
     * Método para obtener el valor de la varible area
     * @return this.area
     */
    public String obtener_area(){
        return area;
    }

    /**
     * Método para obtener el valor de la varible docente
     * @return this.docente
     */
    public String obtener_docente(){
        return docente;
    }

    /**
     * Método para actualiza el valor de la varible direccion
     * @param  direccion
     */
    public void actualizar_direccion(String direccion){ this.direccion = direccion; }

    /**
     * Método para actualizar el valor de la varible carrera
     * @param  carrera
     */
    public void actualizar_carrera(String carrera){
        this.carrera = carrera;
    }

    /**
     * Método para actualizar el valor de la varible area
     * @param  area
     */
    public void actualizar_area(String area){
        this.area = area;
    }

    /**
     * Método para actualizar el valor de la varible docente
     * @param  docente
     */
    public void actualizar_docente(String docente){
        this.docente = docente;
    }
}
