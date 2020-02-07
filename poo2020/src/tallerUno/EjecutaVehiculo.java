package tallerUno;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.actualizar_marca("Toyota");
        vehiculo.actualizar_modelo("Hilux");
        vehiculo.actualizar_procedencia("Alemania");
        vehiculo.actualizar_cilindraje("2.20 cilidraje");
    }
}
