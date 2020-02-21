package arreglosdeberpoo;

public class Estudiante {
    // varibles globales
    private String[] nombre = new String[5];
    private int[] edad = new int[5];
    private String[] universidad = new String[5];
    private String[] celular = new String[5];

    /**
     * Metodo constructo de la clase Estudiante
     * @param nombre
     * @param edad
     * @param universidad
     * @param celular
     */
    public Estudiante(String nombre[], int edad[], String universidad[], String celular[]) {
        this.nombre = nombre;
        this.edad = edad;
        this.universidad = universidad;
        this.celular = celular;
    }

    /**
     * Metodo para obtener la variable nombre
     * @return this.nombre
     */
    public String[] getNombre() {
        return nombre;
    }

    /**
     * Metodo para actualizar la variable nombre
     * @param nombre
     */
    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la variable edad
     * @return this.edad
     */
    public int[] getEdad() {
        return edad;
    }

    /**
     * Metodo para actualizar la variable edad
     * @param edad
     */
    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    /**
     * Metodo para obtener la variable universidad
     * @return this.universidad
     */
    public String[] getUniversidad() {
        return universidad;
    }

    /**
     * Metodo para actualizar la variable universidad
     * @param universidad
     */
    public void setUniversidad(String[] universidad) {
        this.universidad = universidad;
    }

    /**
     * Metodo para obtener la variable celular
     * @return this.celular
     */
    public String[] getCelular() {
        return celular;
    }

    /**
     * Metodo para actualizar la variable celular
     * @param celular
     */
    public void setCelular(String[] celular) {
        this.celular = celular;
    }

    /**
     * Metodo para obtener los datos a presentar
     */
    public void obtenerEstudiante() {
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("-\tNombre: " + nombre[i]);
            System.out.println("-\tEdad: " + edad[i]);
            System.out.println("-\tUniversidad: " + universidad[i]);
            System.out.println("-\tCelular: " + celular[i]);
            System.out.println("-----------------------");

        }
    }
}
