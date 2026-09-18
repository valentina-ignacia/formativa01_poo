package org.example;

public class EmpleadoPorHoras extends Empleado{

    /* Atributos */
    private int horasTrabajadas;
    private double valorHora;

    /* Constructor Parámetros */
    public EmpleadoPorHoras(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase, int horasTrabajadas, double valorHora) {
        super(nombre, idEmpleado, telefono, activo, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    /* Getters n Setters */
    public int getHorasTrabajadas() {
        return horasTrabajadas;}

    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas > 0) {
            this.horasTrabajadas = horasTrabajadas;
        } else {
            System.out.println("¡Las horas trabajadas no deben ser menor o igual a cero!");
        }
    }

    public double getValorHora() {
        return valorHora;}

    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            System.out.println("¡El valor de las horas no deben ser menor o igual a cero!");
        }
    }

    /* Métodos Heredados */
    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public String obtenerRol() {
        return "Por horas"; }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " | Horas: "+ horasTrabajadas+" | Valor por hora: "+valorHora;
    }
}
