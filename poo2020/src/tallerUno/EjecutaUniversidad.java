package tallerUno;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.actualizar_direccion("Sauces Norte");
        universidad.actualizar_carrera("Ciencias de la computación");
        universidad.actualizar_area("Área Técnica");
        universidad.actualizar_docente("Benito");
    }
}
