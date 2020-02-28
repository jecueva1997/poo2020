package herenciafigura;

public class Circulo extends Figura {
    public Circulo(String nombre, double radioCirc){
        this.nombre = nombre;
        this.radioCirc = radioCirc;
    }
    private double radioCirc;
    private double areaCirc;

    public double getRadioCirc() {
        return radioCirc;
    }

    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }

    public double getAreaCirc() {
        return areaCirc;
    }

    public void setAreaCirc(double areaCirc) {
        this.areaCirc = areaCirc;
    }

    public double calcularAreaCirc(){
        areaCirc = 3.14 * radioCirc;
        return areaCirc;
    }
}
