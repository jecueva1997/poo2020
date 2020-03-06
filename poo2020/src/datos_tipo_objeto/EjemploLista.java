package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        // Creación de una lista en java para almacenar valores de tipo String
        List<String> universidades = new ArrayList<String>();
        universidades.add("UTPL");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("ESPOL");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("UNL");
        System.out.println("Tamaño de la lista: "+universidades.size());
        // Eliminación del elemento en la posición 1
        universidades.remove(1);
        // Reemplazamos los valores de la posición de la lista
        universidades.set(1, "UIDE");
        // Agregamos
        universidades.add(1, "UNL");
        System.out.println("Tamaño de la lista luego de eliminar el elemento: "+universidades.size());
        // recorremos lista para presentar valores
        /*
        for (int i = 0; i< universidades.size(); i++ ){
            System.out.println(universidades.get(i));
        }
         */
        // Para recorrer lista de universidades
        for (String uni: universidades) {
            System.out.println(uni);
        }
    }
}
