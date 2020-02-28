package herenciafigura;

public class Rectangulo extends Figura{
    public Rectangulo(String nombre, double baseRecta, double alturaRecta){
        this.nombre = nombre;
        this.alturaRecta = alturaRecta;
        this.baseRecta = baseRecta;
    }
    private double baseRecta;
    private double alturaRecta;
    private double areaRectan;

    public double getBaseRecta() {
        return baseRecta;
    }

    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public double getAlturaRecta() {
        return alturaRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    public double getAreaRectan() {
        return areaRectan;
    }

    public void setAreaRectan(double areaRectan) {
        this.areaRectan = areaRectan;
    }

    public double calcularAreaRectan(){
        alturaRecta = baseRecta * alturaRecta;
        return  alturaRecta;
    }
}
