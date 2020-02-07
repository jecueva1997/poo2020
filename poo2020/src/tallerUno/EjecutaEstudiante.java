package tallerUno;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // creación de objeto tiempo
        Estudiante estudiante = new Estudiante();
        estudiante.actualizar_nombre("Jose");
        estudiante.actualizar_edad(25);
        estudiante.actualizar_carrera("Computación");
        estudiante.actualizar_ciclo("Primero");
        estudiante.actualizar_genero("Masculino");
        String mostrar_estudiante = estudiante.obtener_estudiante();
        String mostrar_estudiante1 = estudiante.obtener_estudiante1();
        System.out.println(mostrar_estudiante + "\n" +mostrar_estudiante1);
    }
}
