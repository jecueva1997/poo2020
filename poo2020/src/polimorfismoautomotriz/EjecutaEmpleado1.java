package polimorfismoautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        String nombre, departamento, puesto;
        double sueldo, cost_trabajos = 0, precAuto = 0;
        int op = 0;
        int trab_real, vent_real;

        // Cadena vacia
        String cadena2 = "" ;
        System.out.println("CALCULO DE SUELDO DE EMPLEADOS");

        // Cadena con el reporte
        String cadena = "REPORTE NOMINA QUINCENAL\nRFC\t\t\tNOMBRE\t\t\t\tDEPTO\t\t\t\tPUESTO\t\t\t\tSUELDOQUINCENAL\n";
        cadena += "-----------------------------------------------------------------------------------------";
        boolean salir = true;

        // Cilo de repetición while
        while(salir == true){

            // Menú de opciones
            System.out.println("------------------Quincena de Empleado --------------------");
            System.out.println(" Digitar 1 Empleado Administrativo ");
            System.out.println(" Digitar 2 Empleado Mecánico");
            System.out.println(" Digitar 3 Empleado Vendedor ");
            System.out.println("-----------------------------------------------------------");
            op = teclado.nextInt();

            // switch para las diferentes opciones que contiene el menú
            switch (op){
                case 1:

                    // Ingreso de datos por teclado
                    departamento = "Administrativo";
                    teclado.nextLine();
                    System.out.println("Ingrese el Nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Puesto de trabajo: ");
                    puesto = teclado.nextLine();
                    System.out.println("Ingrese el sueldo mensual: ");
                    sueldo = teclado.nextDouble();

                    // Creación de un nuevo objeto
                    EmpAdmvo1 empAdmvo = new EmpAdmvo1(nombre, departamento, puesto, sueldo);

                    // Método de la clase padre
                    empAdmvo.calcularSueldoQna();
                    // Concatenación de cadenas
                    cadena2 += "RCF\t\t"+empAdmvo.getNombre()+"\t\t\t"+empAdmvo.getDepartamento()+"\t\t\t"
                            +empAdmvo.getPuesto()+"\t\t\t"+empAdmvo.getSueldo_quince()+"\n";
                    break;

                case 2:

                    // Ingreso de datos por teclado
                    departamento = "Mecanico";
                    teclado.nextLine();
                    System.out.println("Ingrese el Nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Puesto de trabajo: ");
                    puesto = teclado.nextLine();
                    System.out.println("Ingrese el numero de trabajos " );
                    trab_real = teclado.nextInt();

                    // Creación de un nuevo objeto
                    EmpMecanico1 empMecanico = new EmpMecanico1(nombre, departamento, puesto, trab_real, cost_trabajos);

                    // Método del calculo de la clase padre
                    empMecanico.calcularSueldoQna();

                    // Concatenación de cadenas
                    cadena2 += "RCF\t\t"+empMecanico.getNombre()+"\t\t\t  "+empMecanico.getDepartamento()
                            +"\t\t\t"+empMecanico.getPuesto()+"\t\t\t"+empMecanico.getSueldo_quince()+"\n";

                    break;

                case 3:

                    // Ingreso de datos por teclado
                    departamento = "Vendedor";
                    System.out.println("Ingrese el Nombre: ");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    System.out.println("Ingrese el Puesto de trabajo: ");
                    puesto = teclado.nextLine();
                    System.out.println("Ingrese el número de autos vendidos: ");
                    vent_real = teclado.nextInt();

                    // Creación de un nuevo objeto
                    EmpVendedor1 empVendedor = new EmpVendedor1(nombre, departamento, puesto, vent_real, precAuto);

                    // Método de la clase padre
                    empVendedor.calcularSueldoQna();

                    // Concatenación de cadenas
                    cadena2 += "RCF\t\t"+empVendedor.getNombre()+"\t\t\t  "+empVendedor.getDepartamento()
                            +"\t\t\t"+empVendedor.getPuesto()+"\t\t\t "+empVendedor.getSueldo_quince()+"\n";
                    break;


            }
            teclado.nextLine();

            // Presentación de opcion para seguir registrando datos
            System.out.println("Desea Calcular el Sueldo Quincenal de algun otro empleado Ingrese Si/No");
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
