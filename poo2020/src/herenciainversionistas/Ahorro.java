package herenciainversionistas;

public class Ahorro extends Inversionista {

    /**
     * Método constructor para la clase Ahorro
     * @param nomCliente
     * @param numCliente
     * @param numCuenta
     * @param capInvert
     * @param plazInver
     * @param inteAnual
     */
    public Ahorro(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    // Variable global
    private double interesAhorro;

    /**
     * Método para calcular el intéres
     * @return interesAhorro
     */
    public double calcularInteresAhorro() {
        inteAnual = 0.15;
        interesAhorro = capInvert * (inteAnual * plazInver);
        return interesAhorro;
    }

    // Métodos get y set de la variable
    public double getInteresAhorro() {
        return interesAhorro;
    }

    public void setInteresAhorro(double interesAhorro) {
        this.interesAhorro = interesAhorro;
    }
}


