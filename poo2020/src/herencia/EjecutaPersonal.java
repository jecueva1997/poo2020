package herencia;

import java.util.Date;
import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args) {
        // Creacion de objeto de la clase estudiante

        String nombre, identificacion, estado_civil, fecha_nac, carrera, area, dependedncia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Creacion de objeto Estudiante");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese carrera: ");
        carrera = teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fecha_nac = teclado.nextLine();

        // Creacion de objeto de la clase estudiante
        Estudiante est = new Estudiante(carrera, nombre, identificacion, estado_civil, fecha_nac);

        System.out.println("------------------------------");
        System.out.println("Datos de objetos estudiantes");
        System.out.println("Nombre: " +est.getNombre());
        System.out.println("Identificacion: " +est.getIdentificacion());
        System.out.println("Carrera: " +est.getCarrera());
        System.out.println("Estado Civil: " +est.getEstado_civil());
        System.out.println("Fecha de nacimiento: " +est.getFecha_nacimiento());

        // Docente
        System.out.println("Creacion de objeto Docente");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese carrera: ");
        area = teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fecha_nac = teclado.nextLine();

        // Creacion de objeto de la clase Docente
        Docente docente = new Docente(area, nombre, identificacion, estado_civil, fecha_nac);
        System.out.println("------------------------------");
        System.out.println("Datos de objetos docente");
        System.out.println("Nombre: " +docente.getNombre());
        System.out.println("Identificacion: " +docente.getIdentificacion());
        System.out.println("Area: " +docente.getArea());
        System.out.println("Estado Civil: " +docente.getEstado_civil());
        System.out.println("Fecha de nacimiento: " +docente.getFecha_nacimiento());

        // Administrativo
        System.out.println("Creacion de objeto Administrativo");
        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion = teclado.nextLine();
        System.out.println("Ingrese dependencia: ");
        dependedncia = teclado.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil = teclado.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fecha_nac = teclado.nextLine();

        // Creacion de objeto de la clase Administrativo
        Administrativo administrativo = new Administrativo(dependedncia, nombre, identificacion, estado_civil, fecha_nac);
        System.out.println("------------------------------");
        System.out.println("Datos de objetos administrtivo");
        System.out.println("Nombre: " +administrativo.getNombre());
        System.out.println("Identificacion: " +administrativo.getIdentificacion());
        System.out.println("Dependencia: " +administrativo.getDependencia());
        System.out.println("Estado Civil: " +administrativo.getEstado_civil());
        System.out.println("Fecha de nacimiento: " +administrativo.getFecha_nacimiento());
    }


}
