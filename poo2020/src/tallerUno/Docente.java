package tallerUno;

public class Docente {
    // definición de atributos de forma global
    private String materia;
    private int horario;
    private String departamento;
    private String nombre;
    private String lugarTrabajo;

    // definición de métodos

    /**
     * Método para obtener el valor de la varible materia
     * @return this.materia
     */
    public String obtener_materia(){
        return materia;
    }

    /**
     * Método para obtener el valor de la varible horario
     * @return this.horario
     */
    public int obtener_horario(){
        return horario;
    }

    /**
     * Método para obtener el valor de la varible departamento
     * @return this.departamento
     */
    public String obtener_departamento(){
        return departamento;
    }

    /**
     * Método para obtener el valor de la varible nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Método para obtener el valor de la varible lugarTrabajo
     * @return this.lugarTrabajo
     */
    public String obtener_lugarTrabajo(){
        return lugarTrabajo;
    }

    /**
     * Método para actualizar el valor de la varible materia
     * @param  materia
     */
    public void actualizar_materia(String materia){
        this.materia = materia;
    }

    /**
     * Método para actualizar el valor de la varible horario
     * @param  horario
     */
    public void actualizar_horario(int horario){
        this.horario = horario;
    }

    /**
     * Método para actualizar el valor de la varible departamento
     * @param  departamento
     */
    public void actualizar_departamento(String departamento){
        this.departamento = departamento;
    }

    /**
     * Método para actualizar el valor de la varible nombre
     * @param  nombre
     */
    public void actualizar_nombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Método para actualizar el valor de la varible lugarTrabajo
     * @param  lugarTrabajo
     */
    public void actualizar_lugarTrabajo(String lugarTrabajo){
        this.lugarTrabajo = lugarTrabajo;
    }

}
