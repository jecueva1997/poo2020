package herenciadeudores;
import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {

        // Scanner
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nomCliente;
        int numCliente, numCuenta, op = 0;
        double capPrest, plazInver, inteAnual = 0;

        // Cadena vacia
        String cadena2 = "" ;
        System.out.println("CALCULO DE DEUDORES");

        // Cadena con el reporte
        String cadena = "REPORTE DE INVERSIONES\nNo.Cliente\t\tNOMBRE\t\t\tNo.Cuenta\t\t\tInterés por pagar\n";
        cadena += "-----------------------------------------------------------------------------------------";
        boolean salir = true;

        // Cilo de repetición while
        while(salir == true){

            // Menú de opciones
            System.out.println("1. Opcion 1: Para calcular el interes del Préstamo Personal");
            System.out.println("2. Opcion 2: Para calcular el interes del Préstamo Hipotecario");
            System.out.println("3. Opcion 3: Para calcular el interes del Préstamo Automóvil");
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
                    System.out.println("Capital Prestado: ");
                    capPrest = teclado.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    PrestamoPersonal personal = new PrestamoPersonal(nomCliente, numCliente, numCuenta, capPrest,
                            plazInver, inteAnual);

                    // Concatenación de cadenas
                    cadena2 += "\t"+personal.getNumCliente()+"\t\t\t"+personal.getNomCliente()+"\t\t\t\t"
                            +personal.getNumCuenta()+"\t\t\t\t\t"+personal.calcularInteresPersonal()+"\n";
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
                    System.out.println("Capital prestado: ");
                    capPrest = teclado.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    PrestamoHipotecario hipotecario = new PrestamoHipotecario(nomCliente, numCliente, numCuenta,
                            capPrest, plazInver, inteAnual);

                    // Concatenación de cadenas
                    cadena2 += "\t"+hipotecario.getNumCliente()+"\t\t\t"+hipotecario.getNomCliente() +"\t\t\t\t"
                            +hipotecario.getNumCuenta()+"\t\t\t\t"+hipotecario.calcularInteresHipotecario()+"\n";
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
                    System.out.println("Capital prestado: ");
                    capPrest = teclado.nextDouble();
                    System.out.println("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    PrestamoAuto auto = new PrestamoAuto(nomCliente, numCliente, numCuenta, capPrest, plazInver,
                            inteAnual);

                    // Concatenación de cadenas
                    cadena2 += "\t"+auto.getNumCliente()+"\t\t\t"+auto.getNomCliente()
                            +"\t\t\t\t"+auto.getNumCuenta()+"\t\t\t\t\t"+auto.calcularInteresAuto()+"\n";
                    break;


            }
            teclado.nextLine();

            // Presentación de opcion para seguir registrando datos
            System.out.println("Desea seguir calculando deudores Ingrese Si/No");
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
