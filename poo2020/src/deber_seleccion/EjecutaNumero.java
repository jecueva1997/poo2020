package deber_seleccion;

import java.util.Scanner;

public class EjecutaNumero {
    public static void main(String[] args) {
        // Scanner para dar paso al ingreso de datos por teclado
        Scanner teclado = new Scanner(System.in);

        // Datos ingresados por teclado
        System.out.println("Ingrese el primer número: ");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = teclado.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        double num3 = teclado.nextDouble();
        System.out.println("Ingrese el cuarto número: ");
        double num4 = teclado.nextDouble();

        // Crear objeto desde clase empleado
        Numero numero = new Numero(num1, num2, num3, num4);
        numero.calcularNumMayor();
        numero.obtnerNumMayor();
    }
}
