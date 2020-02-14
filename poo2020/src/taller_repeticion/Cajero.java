/**
 * Integrantes: Jeferson Cueva, Frank Saca, Isaias Silva
 */
package taller_repeticion;

public class Cajero {
    private String nombre;
    private int saldo;

    /**
     * constructor para la clase Cajero
     * @param saldo
     */
    public Cajero (int saldo){
        this.saldo = saldo;

    }
    public int consultar_saldo() {
        return saldo;
    }

    /**
     * metodo para realizar un deposito
     * @param valor_deposito
     */
    public void depositar(int valor_deposito) {
        if (valor_deposito > 0) {
            saldo = saldo + valor_deposito;
        }else{
            System.out.println("El valor ingresado no es correcto");
        }
/**
 * metodo para retirar dinero
 */
    }
    public void retirar(int valor_retiro){
        if (valor_retiro <= saldo) {
            saldo = saldo - valor_retiro;

        }else{
            System.out.println("El valor ingresado no es correcto");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
