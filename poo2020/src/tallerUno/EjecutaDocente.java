package tallerUno;

public class EjecutaDocente {
    public static void main(String[] args) {
        // creación de objeto tiempo
        Docente docente = new Docente();
        docente.actualizar_materia("Programación");
        docente.actualizar_horario(15);
        docente.actualizar_departamento("Área Técnica");
        docente.actualizar_nombre("Juanito");
        docente.actualizar_lugarTrabajo("UTPL");
    }
}
