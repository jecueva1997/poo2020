package herenciadeudores;

public class ClienteDeudor {

    // Variables de la clase padre
    protected int numCliente;
    protected String nomCliente;
    protected int numCuenta;
    protected double capPrest;
    protected double plazInver;
    protected double inteAnual;

    // Métodos get y set de las variables
    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getCapPrest() {
        return capPrest;
    }

    public void setCapPrest(double capPrest) {
        this.capPrest = capPrest;
    }

    public double getPlazInver() {
        return plazInver;
    }

    public void setPlazInver(double plazInver) {
        this.plazInver = plazInver;
    }

    public double getInteAnual() {
        return inteAnual;
    }

    public void setInteAnual(double inteAnual) {
        this.inteAnual = inteAnual;
    }
}
