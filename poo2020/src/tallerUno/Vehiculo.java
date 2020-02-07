package tallerUno;

public class Vehiculo {
    // definición de atributos de forma global
    private String marca;
    private String modelo;
    private String procedencia;
    private String cilindraje;

    // definición de métodos

    /**
     * Método para obtener el valor de la varible marca
     * @return this.marca
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * Método para obtener el valor de la varible modelo
     * @return this.modelo
     */
    public String obtener_modelo(){
        return modelo;
    }

    /**
     * Método para obtener el valor de la varible procedencia
     * @return this.procedencia
     */
    public String obtener_procedencia(){
        return procedencia;
    }

    /**
     * Método para obtener el valor de la varible cilindraje
     * @return this.cilindraje
     */
    public String obtener_cilindraje(){
        return cilindraje;
    }

    /**
     * Método para actualiza el valor de la varible marca
     * @param  marca
     */
    public void actualizar_marca(String marca){this.marca = marca; }

    /**
     * Método para actualizar el valor de la varible modelo
     * @param  modelo
     */
    public void actualizar_modelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Método para actualizar el valor de la varible procedencia
     * @param  procedencia
     */
    public void actualizar_procedencia(String procedencia){
        this.procedencia = procedencia;
    }

    /**
     * Método para actualizar el valor de la varible cilindraje
     * @param  cilindraje
     */
    public void actualizar_cilindraje(String cilindraje){
        this.cilindraje = cilindraje;
    }

}
