package diseñopoo;

public class Cerveza {
    private double precio;
    private int unidades;
    private String nombre;
    private String tipo;

    public Cerveza(double precio, int unidades, String nombre, String tipo){
        this.precio = precio;
        this.unidades = unidades;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Método para obtener el valor de la varible total
     * @return total
     */
    public double obtener_total(){
        double total_ventas = precio * unidades;
        return total_ventas;

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void presentarDatos(){
        System.out.println("Cerveza: "+nombre +"\nTipo: "+tipo +"\nPrecio: $"+precio +"\nUnidades vendidads: "
                +unidades +"\nTotal ventas: $"+obtener_total());
    }
}
