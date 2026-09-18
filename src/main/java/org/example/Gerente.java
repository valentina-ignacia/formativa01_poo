package org.example;

public class Gerente extends EmpleadoAsalariado implements Bonificable{

    /* Atributos */
    private String departamento;
    private double bonificacionAnual;
    private double avanceBonificacion;
    private double metaDesempeno;

    /* Constructor Parámetros */
    public Gerente(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase, double sueldoMensual, String departamento, double bonificacionAnual,  double avanceBonificacion, double metaDesempeno) {
        super(nombre, idEmpleado, telefono, activo, salarioBase, sueldoMensual);
        this.departamento = departamento;
        this.bonificacionAnual = bonificacionAnual;
        this.avanceBonificacion = avanceBonificacion;
        this.metaDesempeno = 0;
    }

    /* Getters n Setters */
    public String getDepartamento() {
        return departamento;}

    public void setDepartamento(String departamento) {
        this.departamento = departamento;}

    public double getBonificacionAnual() {
        return bonificacionAnual;}

    public void setBonificacionAnual(double bonificacionAnual) {
        this.bonificacionAnual = bonificacionAnual;}

    public double getAvanceBonificacion() {
        return avanceBonificacion;}

    public void setAvanceBonificacion(double avanceBonificacion) {
        this.avanceBonificacion = avanceBonificacion;}

    /* Interfaz */
    @Override
    public void asignarMeta(double meta) {
        double metaDesempeno = meta;
    }

    @Override
    public double calcularBonificacion() {
        double bonificacion;
        if (avanceBonificacion >= metaDesempeno) {
            bonificacion = getSueldoMensual() * 0.2;
        } else {
            bonificacion = 0;
        }
        return bonificacion;
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

    /* Método adicional */
    public void asignarDepartamento(String depto) {
        this.departamento = depto;
    }

}
