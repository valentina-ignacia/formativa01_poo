package org.example;

public class EmpleadoPorHoras extends Empleado{

    /* Atributos */
    private int horasTrabajadas;
    private double valorHora;

    /* Constructor Parámetros */
    public EmpleadoPorHoras(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase, int horasTrabajadas, double valorHora) {
        super(nombre, idEmpleado, telefono, activo, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    /* Getters n Setters */
    public int getHorasTrabajadas() {
        return horasTrabajadas;}

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;}

    public double getValorHora() {
        return valorHora;}

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;}

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public String obtenerRol() {
        return "Por horas"; }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " | Horas: "+getHorasTrabajadas()+" | Valor por hora: "+getValorHora();
    }
}
