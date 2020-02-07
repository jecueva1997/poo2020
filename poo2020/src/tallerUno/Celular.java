package tallerUno;

public class Celular {
    // definición de atributos de forma global
    private String marca;
    private String modelo;
    private String capacidad;
    private String gama;
    private String camara;
    private String pantalla;

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
     * Método para obtener el valor de la varible capacidad
     * @return this.capacidad
     */
    public String obtener_capacidad(){
        return capacidad;
    }

    /**
     * Método para obtener el valor de la varible gama
     * @return this.gama
     */
    public String obtener_gama(){
        return gama;
    }

    /**
     * Método para obtener el valor de la varible camara
     * @return this.camara
     */
    public String obtener_camara(){
        return camara;
    }

    /**
     * Método para obtener el valor de la varible pantalla
     * @return this.pantalla
     */
    public String obtener_pantalla(){
        return pantalla;
    }

    /**
     * Método para actualiza el valor de la varible marca
     * @param  marca
     */
    public void actualizar_marca(String marca){ this.marca = marca; }

    /**
     * Método para actualizar el valor de la varible modelo
     * @param  modelo
     */
    public void actualizar_modelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Método para actualizar el valor de la varible capacidad
     * @param  capacidad
     */
    public void actualizar_capacidad(String capacidad){
        this.capacidad = capacidad;
    }

    /**
     * Método para actualizar el valor de la varible gama
     * @param  gama
     */
    public void actualizar_gama(String gama){
        this.gama = gama;
    }

    /**
     * Método para actualizar el valor de la varible camara
     * @param  camara
     */
    public void actualizar_camara(String camara){
        this.camara = camara;
    }

    /**
     * Método para actualiza el valor de la varible pantalla
     * @param  pantalla
     */
    public void actualizar_pantalla(String pantalla){ this.pantalla = pantalla; }

}
