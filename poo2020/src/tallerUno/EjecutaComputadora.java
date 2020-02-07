package tallerUno;

public class EjecutaComputadora {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.actualizar_marca("LG");
        computadora.actualizar_sistemaOperativo("Linux");
        computadora.actualizar_precio(1000);
        computadora.actualizar_caracteristicas("core i8");

    }
}
