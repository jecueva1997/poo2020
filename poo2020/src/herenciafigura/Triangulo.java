package herenciafigura;

public class Triangulo  extends Figura {
    public Triangulo(String nombre, double baseTria, double alturaTria){
        this.nombre = nombre;
        this.baseTria= baseTria;
        this.alturaTria=alturaTria;
    }
    private double baseTria;
    private double alturaTria;
    private double areaTria;

    public double getBaseTria() {
        return baseTria;
    }

    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    public double getAlturaTria() {
        return alturaTria;
    }

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }

    public double getAreaTria() {
        return areaTria;
    }

    public void setAreaTria(double areaTria) {
        this.areaTria = areaTria;
    }

    public double calacularAreaTrian(){
        areaTria = (baseTria * alturaTria)/2;
        return areaTria;
    }

}
