package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehículo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        System.out.println("SISTEMA DE INGRESO DE VEHÍCULOS");
        boolean bandera = true;
        do {
            System.out.println("Digite 1 para almacenar nuevo");
            System.out.println("Digite 2 para presentar");
            System.out.println("Digite 3 para salir");
            int op = teclado.nextInt();
            teclado.nextLine();
            switch (op){
                case 1:
                    Vehiculo vehiculo = new Vehiculo();
                    System.out.println("Ingrese placa: ");
                    vehiculo.setPlaca(teclado.nextLine());
                    System.out.println("Ingrese marca: ");
                    vehiculo.setMarca(teclado.nextLine());
                    System.out.println("Ingrese modelo: ");
                    vehiculo.setModelo(teclado.nextLine());
                    System.out.println("Ingrese color: ");
                    vehiculo.setColor(teclado.nextLine());
                    System.out.println("Ingrese año: ");
                    vehiculo.setAnio(teclado.nextInt());
                    teclado.nextLine();
                    System.out.println("Ingrese cilindraje: ");
                    vehiculo.setCilindraje(teclado.nextInt());
                    // Agregamos objeto vehículo a la lista
                    vehiculos.add(vehiculo);
                    break;

                case 2:
                    // System.out.println("PLACA\tMARCA\tCilindraje: ");
                    for (Vehiculo v: vehiculos) {
                        System.out.println("-----------------------");
                        System.out.println("PLaca: "+v.getPlaca());
                        System.out.println("Marca: "+v.getMarca());
                        System.out.println("Modelo: "+v.getModelo());
                        System.out.println("Año: "+v.getAnio());
                        System.out.println("Cilindraje: "+v.getCilindraje());
                        System.out.println("Color: "+v.getColor());
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
