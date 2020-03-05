package polimorfismoinversionistas;

public class Ahorro1 extends Inversionista1 {
    /**
     * Método constructor para la clase Ahorro
     * @param nomCliente
     * @param numCliente
     * @param numCuenta
     * @param capInvert
     * @param plazInver
     * @param inteAnual
     */
    public Ahorro1(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    /**
     * Método abstracto, que será implementado
     * dentro de las clases hijas
     */
    @Override
    public void calcularInteresGan() {
        inteAnual = 0.15;
        interesGan = capInvert * (inteAnual * plazInver);
    }
}
