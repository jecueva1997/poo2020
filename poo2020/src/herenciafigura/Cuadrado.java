package herenciafigura;

public class Cuadrado extends Figura{
    public Cuadrado(String nombre, double lado){
        this.nombre = nombre;
        this.setLado(lado);
    }
    private double lado;
    private double areaCuadr;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAreaCuadr() {
        return areaCuadr;
    }

    public void setAreaCuadr(double areaCuadr) {
        this.areaCuadr = areaCuadr;
    }

    public double calcularAreaCuadr(){
        areaCuadr = lado * lado;
        return areaCuadr;
    }
}
