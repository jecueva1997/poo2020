package herenciadeudores;

public class PrestamoHipotecario extends ClienteDeudor{

    /**
     * Método constructor de la clase PrestamoHipotecario
     * @param nomCliente
     * @param numCliente
     * @param numCuenta
     * @param capPrest
     * @param plazInver
     * @param inteAnual
     */
    public PrestamoHipotecario(String nomCliente, int numCliente, int numCuenta, double capPrest, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capPrest = capPrest;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    // Variable global
    private double interesHipotecario;


    // Métodos get y set de la variables
    public double getInteresHipotecario() {
        return interesHipotecario;
    }

    public void setInteresHipotecario(double interesHipotecario) {
        this.interesHipotecario = interesHipotecario;
    }

    /**
     * Método para calcula el interés
     * @return interesHipotecario
     */
    public double calcularInteresHipotecario() {
        inteAnual = 0.20;
        interesHipotecario = capPrest * (inteAnual * plazInver);
        return interesHipotecario;
    }
}
