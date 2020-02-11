package diseniopoo;

public class Nota {
    private String estudiante;
    private String asignatura;
    private double bimestre1;
    private double bimestre2;

    public Nota(String estudiante, String asignatura, double bimestre1, double bimestre2){
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.bimestre1 = bimestre1;
        this.bimestre2 = bimestre2;
    }

    /**
     * Método para obtener el valor de la varible promedio
     * @return promedio
     */

    public double obtener_promedio(){
        double promedio = bimestre1 + bimestre2;
        return promedio;
    }


    /**
     * Método para obtener el valor de la varible estado
     * @return estado
     */

    public String obtener_estado(){
        String estado = "";
        if (obtener_promedio() >=27.5){
            estado = "Aprueba con Normalidad";
        }else{
            estado = "No aprueba - Supletorios";
        }
        return estado;
    }


    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getBimestre1() {
        return bimestre1;
    }

    public void setBimestre1(double bimestre1) {
        this.bimestre1 = bimestre1;
    }

    public double getBimestre2() {
        return bimestre2;
    }

    public void setBimestre2(double bimestre2) {
        this.bimestre2 = bimestre2;
    }


    public void presentarRegistro(){
        System.out.println("Universidad Técnica Particular de Loja\nRegistro Académico de Estudiante\n"
                +"Nombre del estudiante: "+estudiante +"\nAsignatura: "+asignatura +"\n1 Bimestre: "
                +bimestre1 +"\n2 Bimestre: " +bimestre2 +"\nNota Promedio: "+obtener_promedio()
                +"\nEstado: "+obtener_estado());
    }

}
