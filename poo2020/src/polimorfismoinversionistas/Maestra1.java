package polimorfismoinversionistas;

public class Maestra1 extends Inversionista1 {
    /**
     * Método constructor de la clase Maestra
     * @param nomCliente
     * @param numCliente
     * @param numCuenta
     * @param capInvert
     * @param plazInver
     * @param inteAnual
     */
    public Maestra1(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularInteresGan() {
        inteAnual = 0.30;
        interesGan = capInvert * (inteAnual * plazInver);
    }
}
