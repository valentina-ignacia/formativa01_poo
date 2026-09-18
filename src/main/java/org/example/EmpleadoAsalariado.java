package org.example;

public class EmpleadoAsalariado extends Empleado {

    /* Atributos */
    private double sueldoMensual;

    /*Constructor Parámetros */
    public EmpleadoAsalariado(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase, double sueldoMensual) {
        super(nombre, idEmpleado, telefono, activo, salarioBase);
        this.sueldoMensual = sueldoMensual;
    }

    /* Getters n Setters */
    public double getSueldoMensual() {
        return sueldoMensual;}

    public void setSueldoMensual(double sueldoMensual) {
        if (sueldoMensual > 0) {
            this.sueldoMensual = sueldoMensual;
        } else {
            System.out.println("¡El sueldo mensual no debe ser menor o igual a cero!");
        }
    }

    /* Métodos Heredados */
    @Override
    public double calcularSalario() {
        return getSueldoMensual();
    }

    @Override
    public String obtenerRol() {
        return "Asalariado";
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " | Sueldo mensual: $" +sueldoMensual;
    }
}
