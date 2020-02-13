package deber_seleccion;

public class Numero {
    // varibles globales
    private double num1;
    private double num2;
    private double num3;
    private double num4;
    private double numMayor;

    /**
     * Metodo para obtener la variable num1
     * @return this.num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * Metodo para actualizar la variable num1
     * @param num1
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * Metodo para obtener la variable num2
     * @return this.num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * Metodo para actualizar la variable num2
     * @param num2
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * Metodo para obtener la variable num3
     * @return this.num3
     */
    public double getNum3() {
        return num3;
    }

    /**
     * Metodo para actualizar la variable num3
     * @param num3
     */
    public void setNum3(double num3) {
        this.num3 = num3;
    }

    /**
     * Metodo para obtener la variable num4
     * @return this.num4
     */
    public double getNum4() {
        return num4;
    }

    /**
     * Metodo para actualizar la variable num4
     * @param num4
     */
    public void setNum4(double num4) {
        this.num4 = num4;
    }

    /**
     * Metodo para obtener la variable numMayor
     * @return this.numMayor
     */
    public double getNumMayor() {
        return numMayor;
    }

    /**
     * Metodo para actualizar la variable numMayor
     * @param numMayor
     */
    public void setNumMayor(double numMayor) {
        this.numMayor = numMayor;
    }

    /**
     * Metodo constructor para la Clase Numero
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     */
    public Numero(double num1, double num2, double num3, double num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    /**
     * Método para obtener el valor de la varible numMayor
     * @return numMayor
     */
    public void calcularNumMayor(){
        if((num1 > num2) && (num1 >num3) && (num1 > num4)){
            numMayor = num1;
        }else{
            if((num2 > num1) && (num2 >num3) && (num2 > num4)){
                numMayor = num2;
            }else{
                if((num3 > num1) && (num3 >num2) && (num3 > num4)){
                    numMayor = num3;
                }else{
                    if((num4 > num1) && (num4 >num2) && (num4 > num3)){
                        numMayor = num4;
                    }
                }
            }
        }
    }

    // Método para el sacar solo el número mayor
    public void obtnerNumMayor(){
        System.out.println("El número mayor es: " +numMayor);
    }
}
