package herenciainversionistas;

public class Pagare extends Inversionista{

    /**
     * Método construvtor de la clase Pagare
     * @param nomCliente
     * @param numCliente
     * @param numCuenta
     * @param capInvert
     * @param plazInver
     * @param inteAnual
     */
    public Pagare(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    // Variable global
    private double interesPagare;

    /**
     * Método para calcular el interés
     * @return
     */
    public double calcularInteresPagare() {
        inteAnual = 0.20;
        interesPagare = capInvert * (inteAnual * plazInver);
        return interesPagare;
    }

    // Método get y set de la variable
    public double getInteresPagare() {
        return interesPagare;
    }

    public void setInteresPagare(double interesPagare) {
        this.interesPagare = interesPagare;
    }
}
