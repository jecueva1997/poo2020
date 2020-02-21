package arreglosdeberpoo;

public class Cedula {
    // variables globales privadas
    private int cedula;
    private String estado;
    int validacion = 0;

    /**
     * Metodo para obtener la variable cedula
     *
     * @return this.cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Metodo para actualizar la variable cedula
     *
     * @param cedula
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para obtener la variable estado
     *
     * @return this.estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo para actualizar la variable estado
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Metodo constructor para la clase Cedula
     *
     * @param cedula
     */
    public Cedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * Metodo para la variable actualizar
     */
    public void validacion() {
        // arreglo con los coeficioentes necesarios
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        // inicializacion en modo cedula incorrecta
        estado = "Cédula incorrecta";
        // Arreglo usado para almacear los valores por separado de la cedula
        int[] cedulaArreglo = new int[10];
        // contador usado para el for siguiente
        int a = 9;
        // ciclo usado para el almacenamiento de los datos unitarios
        for (int i = 0; i < cedulaArreglo.length; i++) {
            // asignacion de valores desde el ultimo hasta el primero
            // formula para obtener el ultimo valor de la cedula
            cedulaArreglo[a] = (int) ((cedula / Math.pow(10, i)) % 10);
            // decremento del contador
            a--;
        }
        // variable suma con cero
        int suma = 0;
        // declaracion de variabes local
        int resultCoeficiente;
        // ciclo para obtener la suma de los productos entre los dijitos de la cedula u los coeficientes
        for (int i = 0; i < (cedulaArreglo.length - 1); i++) {
            resultCoeficiente = coeficientes[i] * cedulaArreglo[i];
            // en caso de que sean mayores que nueve se les restara nueve
            if (resultCoeficiente > 9) {
                resultCoeficiente -= 9;
            }
            suma += resultCoeficiente;
        }
        // declaracion de variabes local y asignacion del residuo
        int residuo = suma % 10;
        // condicional para obtener el valor del ultimo dijito
        if (residuo != 0) {
            validacion = 10 - residuo;
        }
        // condicional para validar si tiene igualdad el ultimo dijito con el valor encontrado
        if (validacion == cedulaArreglo[9]) {
            estado = "El numer de cedula es correcto";
        }
    }

    // metodo para obtener el numero de cedula
    public void obtenerCedula() {
        System.out.println(cedula);
    }

    // metodo para obtener el valor de validacion
    public void obtenerValidador() {
        System.out.println(validacion);
    }

    // metodo para obtener el estado
    public void obtenerEstado() {
        System.out.println(estado);
    }
}
