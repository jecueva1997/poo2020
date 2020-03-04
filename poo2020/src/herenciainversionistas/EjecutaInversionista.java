package herenciainversionistas;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {

        // Scanner
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nomCliente;
        int numCliente, numCuenta, op = 0;
        double capInvert, plazInver, inteAnual = 0;

        // Cadena vacia
        String cadena2 = "" ;
        System.out.println("CALCULO DE INVERSIONISTAS");

        // Cadena con el reporte
        String cadena = "REPORTE DE INVERSIONES\nNo.Cliente\t\tNOMBRE\t\t\tNo.Cuenta\t\t\tInterés ganado\n";
        cadena += "-----------------------------------------------------------------------------------------";
        boolean salir = true;

        // Cilo de repetición while
        while(salir == true){

            // Menú de opciones
            System.out.println("1. Opcion 1: Para calcular el interes de la Cuenta de Ahorro");
            System.out.println("2. Opcion 2: Para calcular el interes de la Cuenta de Pagaré");
            System.out.println("3. Opcion 3: Para calcular el interes de la Cuenta  Maestra");
            System.out.println("Escribe una de las opciones");
            op = teclado.nextInt();

            // switch para las diferentes opciones que contiene el menú
            switch (op){
                case 1:

                    // Ingreso de datos por teclado
                    System.out.println("Numero  del Cliente: ");
                    teclado.nextLine();
                    numCliente = teclado.nextInt();
                    System.out.println("Nombre del Cliente: ");
                    teclado.nextLine();
                    nomCliente = teclado.nextLine();
                    System.out.println("Numero de Cuenta: ");
                    numCuenta = teclado.nextInt();
                    System.out.println("Capital invertido: ");
                    capInvert = teclado.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Ahorro ahorro = new Ahorro(nomCliente, numCliente, numCuenta, capInvert, plazInver, inteAnual);


                    // Concatenación de cadenas
                    cadena2 += "\t"+ahorro.getNumCliente()+"\t\t\t"+ahorro.getNomCliente()+"\t\t\t\t"
                            +ahorro.getNumCuenta()+"\t\t\t\t\t"+ahorro.calcularInteresAhorro()+"\n";
                    break;

                case 2:

                    // Ingreso de datos por teclado
                    System.out.println("Numero  del Cliente: ");
                    teclado.nextLine();
                    numCliente = teclado.nextInt();
                    System.out.println("Nombre del Cliente: ");
                    teclado.nextLine();
                    nomCliente = teclado.nextLine();
                    System.out.println("Numero de Cuenta: ");
                    numCuenta = teclado.nextInt();
                    System.out.println("Capital invertido: ");
                    capInvert = teclado.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Pagare pagare = new Pagare(nomCliente, numCliente, numCuenta, capInvert, plazInver, inteAnual);


                    // Concatenación de cadenas
                    cadena2 += "\t"+pagare.getNumCliente()+"\t\t\t"+pagare.getNomCliente()
                            +"\t\t\t\t"+pagare.getNumCuenta()+"\t\t\t\t"+pagare.calcularInteresPagare()+"\n";
                    break;

                case 3:

                    // Ingreso de datos por teclado
                    System.out.println("Numero  del Cliente: ");
                    teclado.nextLine();
                    numCliente = teclado.nextInt();
                    System.out.println("Nombre del Cliente: ");
                    teclado.nextLine();
                    nomCliente = teclado.nextLine();
                    System.out.println("Numero de Cuenta: ");
                    numCuenta = teclado.nextInt();
                    System.out.println("Capital invertido: ");
                    capInvert = teclado.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    Maestra maestra = new Maestra(nomCliente, numCliente, numCuenta, capInvert, plazInver, inteAnual);


                    // Concatenación de cadenas
                    cadena2 += "\t"+maestra.getNumCliente()+"\t\t\t"+maestra.getNomCliente()
                            +"\t\t\t\t"+maestra.getNumCuenta()+"\t\t\t\t\t"+maestra.calcularInteresMaestra()+"\n";
                    break;

            }
            teclado.nextLine();

            // Presentación de opcion para seguir registrando datos
            System.out.println("Desea seguir calculando a los inversionistas Ingrese Si/No");
            String cancelar = teclado.nextLine().toUpperCase();

            //  Condicion para establecer el limite de datos u de terminar presentar el regitro de datos
            if (cancelar.equals("NO")){
                System.out.println(cadena+"\n" + cadena2 );
                op = 5;
                salir = false;
            }else{
                System.out.println();
                op = 4;

            }

        }
    }
}
