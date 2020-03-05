package polimorfismodeudores;

public class PrestamoPersonal1 extends ClienteDeudor1 {
    /**
     * Método constructor de la clase PrestamoPersonal
     * @param nomCliente
     * @param numCliente
     * @param numCuenta
     * @param capPrest
     * @param plazInver
     * @param inteAnual
     */
    public PrestamoPersonal1(String nomCliente, int numCliente, int numCuenta, double capPrest, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capPrest = capPrest;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    /**
     * Implementacion del método abastracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularInteresPag() {
        inteAnual = 0.15;
        intePag = capPrest * (inteAnual * plazInver);
    }
}
