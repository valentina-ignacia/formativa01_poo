package org.example;

public abstract class Empleado {

    /* Atributos */
    protected String nombre;
    protected String idEmpleado;
    protected String telefono;
    protected boolean activo;
    protected double salarioBase;

    /* Constructor Vacío */
    public Empleado() {}

    /* Constructos Parámetros */
    public Empleado(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.telefono = telefono;
        this.activo = activo;
        this.salarioBase = salarioBase;
    }

    /* Getters n Setters */
    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("¡El nombre no debe estar vacío!");
        }
    }

    public String getIdEmpleado() {
        return idEmpleado;}

    public void setIdEmpleado(String idEmpleado) {
        if (idEmpleado != null && !idEmpleado.trim().isEmpty()) {
            this.idEmpleado = idEmpleado;
        } else {
            System.out.println("¡El ID del empleado no debe estar vacío!");
        }
    }

    public String getTelefono() {
        return telefono;}

    public boolean isActivo() {
        return activo;}

    public double getSalarioBase() {
        return salarioBase;}

    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("¡El salario no debe ser menor o igual a cero!");
        }
    }

    /* Métodos Abstractos */
    public abstract double calcularSalario();

    public abstract String obtenerRol();

    /* Métodos Concretos */
    public void activar() {
        if (activo) {
            System.out.println("El empleado ya está activo");
        } else {
            activo = true;
            System.out.println("Empleado activado");
        }
    }

    public void desactivar() {
        if (!activo) {
            System.out.println("El empleado ya está desactivo");
        } else {
            activo = false;
            System.out.println("Empleado desactivado");
        }
    }

    public String mostrarInfo() {
        return "Nombre: "+nombre+" | ID: "+idEmpleado+" | Teléfono: "+telefono+" | Rol: "+obtenerRol()+" | ¿Está activo?: "+(activo ? "Si" : "No")+" | Salario calculado: $"+calcularSalario();
        }

    public void asignarTelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty()) {
            this.telefono = telefono;
        } else {
            System.out.println("¡El teléfono no debe estar vacío!");
        }
    }
}
