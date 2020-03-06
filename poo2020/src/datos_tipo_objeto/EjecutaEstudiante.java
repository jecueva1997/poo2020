package datos_tipo_objeto;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        // Declaración de variables
        int cont, opcion;
        Estudiante [] estudiantes = new Estudiante[3];
        Estudiante estudiante;
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
            for (cont = 0; cont < estudiantes.length; cont++) {
                Estudiante est = new Estudiante();
                System.out.println("Ingrese el nombre: ");
                est.setNombre(teclado.nextLine());
                System.out.println("Ingrese la  cedula: ");
                est.setCedula(teclado.nextLine());
                System.out.println("Ingrese la edad: ");
                est.setEdad(teclado.nextInt());
                teclado.nextLine();
                System.out.println("Ingrese la carrera: ");
                est.setCarrera(teclado.nextLine());
                System.out.println("Ingrese el correo: ");
                est.setCorreo(teclado.nextLine());
                // Asignamos el objeto est a la variable estudiante
                estudiantes[cont] = est;
            }
            System.out.println("LISTA DE ESTUDIANTES");
            System.out.println("Cedula\tNombre");
            int edad_acum = 0;
            for (cont = 0; cont < estudiantes.length; cont++){
                edad_acum = edad_acum + estudiantes[cont].getEdad();
                System.out.println(estudiantes[cont].getCedula()+"\t"+estudiantes[cont].getNombre());
            }
        System.out.println("EDAD PROMEDIO DE LOS ESTUDIANTES: "+(edad_acum / estudiantes.length));
        System.out.println("FIN DEL PROGRAMA");
    }
}
