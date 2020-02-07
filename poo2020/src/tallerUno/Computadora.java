package tallerUno;

public class Computadora {
    // definición de atributos de forma global
    private String marca;
    private String sistemaOperativo;
    private int precio;
    private String caracteristicas;

    // definición de métodos

    /**
     * Método para obtener el valor de la varible marca
     * @return this.marca
     */
    public String obtener_marca(){
        return marca;
    }

    /**
     * Método para obtener el valor de la varible sistemaOperativo
     * @return this.sistemaOperativo
     */
    public String obtener_sistemaOperativo(){
        return sistemaOperativo;
    }

    /**
     * Método para obtener el valor de la varible precio
     * @return this.precio
     */
    public int obtener_precio(){
        return precio;
    }

    /**
     * Método para obtener el valor de la varible caracteristicas
     * @return this.caracteristicas
     */
    public String obtener_caracteristicas(){
        return caracteristicas;
    }

    /**
     * Método para actualiza el valor de la varible marca
     * @param  marca
     */
    public void actualizar_marca(String marca){ this.marca = marca; }

    /**
     * Método para actualizar el valor de la varible sistemaOperativo
     * @param  sistemaOperativo
     */
    public void actualizar_sistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }

    /**
     * Método para actualizar el valor de la varible precio
     * @param  precio
     */
    public void actualizar_precio(int precio){
        this.precio = precio;
    }

    /**
     * Método para actualizar el valor de la varible caracteristicas
     * @param  caracteristicas
     */
    public void actualizar_caracteristicas(String caracteristicas){
        this.caracteristicas = caracteristicas;
    }
}
