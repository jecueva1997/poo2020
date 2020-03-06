package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        System.out.println("SISTEMA DE INGRESO DE NOMBRES");
        boolean bandera = true;
        do {
            System.out.println("Digite 1 para estudiante");
            System.out.println("Digite 2 para presentar");
            System.out.println("Digite 3 para salir");
            int op = teclado.nextInt();
            teclado.nextLine();
            switch (op){
                case 1:
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
                    teclado.nextLine();
                    estudiantes.add(est);
                    break;

                case 2:
                    // System.out.println("PLACA\tMARCA\tCilindraje: ");
                    for (Estudiante v: estudiantes) {
                        System.out.println("-----------------------");
                        System.out.println("Nombre: "+v.getNombre());
                        System.out.println("Cedula: "+v.getCedula());
                        System.out.println("Edad: "+v.getEdad());
                        System.out.println("Carrera: "+v.getCarrera());
                        System.out.println("Corre: "+v.getCorreo());
                        System.out.println("-----------------------");
                        // System.out.println(v.getMarca()+"\t"+v.getMarca()+"\t"+v.getCilindraje());
                    }
                    break;
                case 3:
                    bandera = false;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while (bandera);
    }

}
