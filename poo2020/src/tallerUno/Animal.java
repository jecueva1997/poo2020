package tallerUno;

public class Animal {

    // definición de atributos de forma global
    private String raza;
    private int edad;
    private String especie;

    // definición de métodos

    /**
     * Método para obtener el valor de la varible raza
     * @return this.raza
     */
    public String obtener_raza(){
        return raza;
    }

    /**
     * Método para obtener el valor de la varible edad
     * @return this.edad
     */
    public int obtener_edad(){
        return edad;
    }

    /**
     * Método para obtener el valor de la varible especie
     * @return this.especie
     */
    public String obtener_especie(){
        return especie;
    }

    /**
     * Método para actualiza el valor de la varible raza
     * @param  raza
     */
    public void actualizar_raza(String raza){ this.raza = raza; }

    /**
     * Método para actualizar el valor de la varible edad
     * @param  edad
     */
    public void actualizar_edad(int edad){
        this.edad = edad;
    }

    /**
     * Método para actualizar el valor de la varible especie
     * @param  especie
     */
    public void actualizar_especie(String especie){
        this.especie = especie;
    }

}
