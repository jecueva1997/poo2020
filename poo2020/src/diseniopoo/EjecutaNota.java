package diseniopoo;

import java.util.Scanner;

public class EjecutaNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del estudiante: ");
        String estudiante = teclado.nextLine();
        System.out.println("Nombre de la asignatura: ");
        String asignatura = teclado.nextLine();
        System.out.println("Ingrese nota del 1 Bimestre");
        double bimestre1 = teclado.nextDouble();
        System.out.println("Ingrese nota del 2 Bimestre: ");
        double bimestre2 = teclado.nextDouble();

        Nota nota = new Nota(estudiante, asignatura, bimestre1, bimestre2);
        nota.presentarRegistro();
    }

}
