package arreglosdeberpoo;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombre = new String[5];
        int[] edad = new int[5];
        String[] universidad = new String[5];
        String[] cel = new String[5];
        for (int i=0; i<nombre.length; i++){
            System.out.println("Ingresar nombre del estudiante "+(i+1));
            nombre[i] = teclado.nextLine();
            System.out.println("Ingresar edad del estudiante "+(i+1));
            edad [i]= teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingresar universidad del estudiante "+(i+1));
            universidad[i] = teclado.nextLine();
            System.out.println("Ingresar numero del celular del estudiante "+(i+1));
            cel[i] = teclado.nextLine();
        }
        Estudiante estudiante = new Estudiante(nombre, edad,universidad,cel);
        estudiante.obtenerEstudiante();

    }
}
