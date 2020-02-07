package intropoo;

public class Tiempo {
    // definición de atributos de forma global
    private int hora;
    private int minuto;
    private int segundo;

    // definición de métodos

    /**
     * Método para obtener el valor de la varible hora
     * @return this.hora
     */
    public int obtener_hora(){
        return hora;
    }

    /**
     * Método para obtener el valor de la varible minuto
     * @return this.minuto
     */
    public  int obtener_minuto(){
        return  minuto;
    }

    /**
     * Método para obtener el valor de la varible segundo
     * @return this.segundo
     */
    public int obtener_segundo(){
        return segundo;
    }

    /**
     * Método para obtener el valor de la varible tiempo
     * @return tiempo
     */
    // concatenación de cadena con método
    public String obtener_tiempo(){
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }

    // resive un parámetro

    /**
     * Método para actualiza el valor de la varible hora
     * @param  hora
     */
    public void actualizar_hora(int hora){
        // con el thist hacemos referencia a variables globales
        this.hora = hora;
    }

    /**
     * Método para actualizar el valor de la varible minuto
     * @param  minuto
     */
    public void actualizar_minuto(int minuto){
        this.minuto = minuto;
    }

    /**
     * Método para actualizar el valor de la varible segundo
     * @param  segundo
     */
    public void actualizar_segundo(int segundo){
        this.segundo = segundo;
    }
}
