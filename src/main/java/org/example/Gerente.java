package org.example;

public class Gerente extends EmpleadoAsalariado implements Bonificable{

    /* Atributos */
    private String departamento;
    private double bonificacionAnual;
    private double metaDesempeno;
    private double avanceMeta;

    /* Constructor Parámetros */
    public Gerente(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase, double sueldoMensual, String departamento, double bonificacionAnual,  double avanceBonificacion, double metaDesempeno) {
        super(nombre, idEmpleado, telefono, activo, salarioBase, sueldoMensual);
        this.departamento = departamento;
        this.bonificacionAnual = 0;
        this.metaDesempeno = metaDesempeno;
    }

    /* Getters n Setters */
    public String getDepartamento() {
        return departamento;}

    public double getBonificacionAnual() {
        return bonificacionAnual;}

    public void setBonificacionAnual(double bonificacionAnual) {
        this.bonificacionAnual = bonificacionAnual;}

    public double getAvanceMeta() {
        return avanceMeta;
    }

    public void setAvanceMeta(double avanceMeta) {
        if (avanceMeta > 0) {
            this.metaDesempeno = avanceMeta;
        } else {
            System.out.println("El avance de la meta no puede ser menor o igual a cero");
        }
    }

    /* Interfaz */
    @Override
    public void asignarMeta(double meta) {
        if (meta > 0) {
            this.metaDesempeno = meta;
        } else {
            System.out.println("La meta no puede ser menor o igual a cero.");
        }
    }

    @Override
    public double calcularBonificacion() {
        if (metaDesempeno >= avanceMeta) {
            bonificacionAnual = getSueldoMensual() * 0.20;
        } else {
            bonificacionAnual = 0;
        }

        return bonificacionAnual;
    }

    /* Métodos Abstractos */
    @Override
    public double calcularSalario() {
        return getSueldoMensual() + calcularBonificacion();
    }

    @Override
    public String obtenerRol() {
        return "Gerente";
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " | Departamento: " + departamento + " | Meta: " +metaDesempeno+ " | Bonificación: $" + calcularBonificacion();
    }

    /* Método adicional */
    public void asignarDepartamento(String depto) {
        this.departamento = depto;
    }

}
