package herenciainversionistas;

public class Maestra extends Inversionista {

    /**
     * Método constructor de la clase Maestra
     * @param nomCliente
     * @param numCliente
     * @param numCuenta
     * @param capInvert
     * @param plazInver
     * @param inteAnual
     */
    public Maestra(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    // Variable global
    private double interesMaestra;

    /**
     * Método para calcular el interés
     * @return interesMaestra
     */
    public double calcularInteresMaestra() {
        inteAnual = 0.30;
        interesMaestra = capInvert * (inteAnual * plazInver);
        return interesMaestra;
    }

    // Métodos get y set de la variable
    public double getInteresMaestra() {
        return interesMaestra;
    }

    public void setInteresMaestra(double interesMaestra) {
        this.interesMaestra = interesMaestra;
    }
}

