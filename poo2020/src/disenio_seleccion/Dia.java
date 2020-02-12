package disenio_seleccion;

public class Dia {
    // variables globales
    private int numero;
    private String dia;

    // Metodos get y set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Método para obtener el valor de la varible dia
     * @return dia
     */
    public Dia(int numero){
        this.numero = numero;

    }

    // Calscular referente al numero el dia
    public void calcularNombre(){
        switch (numero){
            case 1: dia = "Domingo";
            break;
            case 2: dia = "Lunes";
            break;
            case 3: dia = "Martes";
            break;
            case 4: dia = "Miercoles";
            break;
            case 5: dia = "Jueves";
            break;
            case 6: dia = "Viernes";
            break;
            case 7: dia = "Sabado";
            break;
            default: dia = "Opción incorrecta";
        }
    }

    // retorno el valor del dia en String
    public String obtenerNombre(){
        return dia;
    }
}
