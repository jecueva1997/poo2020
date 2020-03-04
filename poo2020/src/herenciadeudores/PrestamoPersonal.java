package herenciadeudores;

public class PrestamoPersonal extends ClienteDeudor{

    /**
     * Método constructor de la clase PrestamoPersonal
     * @param nomCliente
     * @param numCliente
     * @param numCuenta
     * @param capPrest
     * @param plazInver
     * @param inteAnual
     */
    public PrestamoPersonal(String nomCliente, int numCliente, int numCuenta, double capPrest, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capPrest = capPrest;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    // Variable global
    private double interesPersonal;

    // Métodos get y set de la variable
    public double getInteresPersonal() {
        return interesPersonal;
    }

    public void setInteresPersonal(double interesPersonal) {
        this.interesPersonal = interesPersonal;
    }

    /**
     * Método para calcular el interés
     * @return interesPersonal
     */
    public double calcularInteresPersonal() {
        inteAnual = 0.15;
        interesPersonal = capPrest * (inteAnual * plazInver);
        return interesPersonal;
    }
}
