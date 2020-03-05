package polimorfismoinversionistas;

public abstract class Inversionista1 {

    // Variables de la clase padre
    protected int numCliente;
    protected String nomCliente;
    protected int numCuenta;
    protected double capInvert;
    protected double plazInver;
    protected double inteAnual;
    protected double interesGan;

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

    public double getCapInvert() {
        return capInvert;
    }

    public void setCapInvert(double capInvert) {
        this.capInvert = capInvert;
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

    public double getInteresGan() {
        return interesGan;
    }

    public void setInteresGan(double interesGan) {
        this.interesGan = interesGan;
    }

    /**
     * Método abstracto, que será implementado
     * dentro de las clases hijas
     */
    public abstract void calcularInteresGan();
}
