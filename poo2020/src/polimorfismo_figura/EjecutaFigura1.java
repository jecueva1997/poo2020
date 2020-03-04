package polimorfismo_figura;

import java.util.Scanner;

public class EjecutaFigura1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("------------------ Figura -------------------------------");
        System.out.println(" Digitar 1: para calcular el área del triangulo   ");
        System.out.println(" Digitar 2: para calcular el área del reactángulo ");
        System.out.println(" Digitar 3: para calcular el área del cuadrado ");
        System.out.println(" Digitar 4: para calcular el área del circulo ");
        System.out.println("---------------------------------------------------------");
        int op = teclado.nextInt();
        // Opciones de datos
        switch (op) {
            case 1:

                Triangulo3 triangulo = new Triangulo3();
                System.out.println("Datos de la figura Triángulo");
                System.out.println("Triangulo") ;
                triangulo.getNomFigura();
                System.out.println("Ingrese la base: ");
                triangulo.setBaseTriang(teclado.nextDouble());
                System.out.println("Ingrese la altura: ");
                triangulo.setAlturaTriang(teclado.nextDouble());
                triangulo.calcularArea();
                System.out.println("El area es: " + triangulo.getArea());

            case 2:
                Reactangulo3 rectangulo3 = new Reactangulo3();
                System.out.println("Datos de la figura Triángulo");
                System.out.println("Rectángulo") ;
                rectangulo3.getNomFigura();
                System.out.println("Ingrese la base: ");
                rectangulo3.setBaseRecta(teclado.nextDouble());
                System.out.println("Ingrese la altura: ");
                rectangulo3.setAlturaRecta(teclado.nextDouble());
                rectangulo3.calcularArea();
                System.out.println("El area es: " + rectangulo3.getArea());
                break;

            case 3:
                Cuadrado3 cuadrado3= new Cuadrado3();
                System.out.println("Datos de la figura Cuadrado");
                System.out.println("Cuadrado") ;
                cuadrado3.getNomFigura();
                System.out.println("Ingrese el lado: ");
                cuadrado3.setLadoCuad(teclado.nextDouble());
                cuadrado3.calcularArea();
                System.out.println("El area es: " + cuadrado3.getArea());
                break;

            case 4:
                Circulo3 circulo3= new Circulo3();
                System.out.println("Datos de la figura Circulo");
                System.out.println("Circulo") ;
                circulo3.getNomFigura();
                System.out.println("Ingrese el radio: ");
                circulo3.setRadioCir(teclado.nextDouble());
                circulo3.calcularArea();
                System.out.println("El area es: " + circulo3.getArea());
                break;
        }
    }
}
