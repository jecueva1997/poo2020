package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombre {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> nombres = new ArrayList<String>();
        boolean salir = true;
        int op = 0;
        // Cilo de repetición while
        while(salir == true){

            // Menú de opciones
            System.out.println("1. Agregar nuevo nombre");
            System.out.println("2. Presentar lista de nombres");
            System.out.println("3. Salir");
            System.out.println("Escribe una de las opciones");
            op = teclado.nextInt();
            teclado.nextLine();


            // switch para las diferentes opciones que contiene el menú
            switch (op){
                case 1:

                    // Ingreso de datos por teclado
                    System.out.println("Ingrese nombre: ");
                    String nombre = teclado.nextLine();
                    nombres.add(nombre);
                    break;

                case 2:
                    System.out.println("--Nombres--");
                    /*
                    for (int i =0; i<nombres.size(); i++){
                        System.out.println("Nombre: "+nombres.get(i));
                    }
                     */
                    for (String nom: nombres) {
                        System.out.println("Nombre: " +nom);
                    }

                    break;

                case 3:
                    salir = false;
                    break;

            }
        }
    }
}
