package herenciadeudores;

public class PrestamoAuto extends ClienteDeudor {

    /**
     * Método constructor de la clase PrestamoAuto
     * @param nomCliente
     * @param numCliente
     * @param numCuenta
     * @param capPrest
     * @param plazInver
     * @param inteAnual
     */
    public PrestamoAuto(String nomCliente, int numCliente, int numCuenta, double capPrest, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capPrest = capPrest;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    // Variable global
    private double interesAuto;

    // Métodos get y set de la variable
    public double getInteresAuto() {
        return interesAuto;
    }

    public void setInteresAuto(double interesAuto) {
        this.interesAuto = interesAuto;
    }

    /**
     * Método para calcular el interés
     * @return interesAuto
     */
    public double calcularInteresAuto() {
        inteAnual = 0.25;
        interesAuto = capPrest * (inteAnual * plazInver);
        return interesAuto;
    }
}
