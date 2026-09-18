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
    public Empleado(String nombre, String idEmpleado, String telefono, boolean activo, double salarioBase) {}

    /* Getters n Setters */
    public String getNombre() {
        return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;}

    public String getIdEmpleado() {
        return idEmpleado;}

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;}

    public String getTelefono() {
        return telefono;}

    public void setTelefono(String telefono) {
        this.telefono = telefono;}

    public boolean isActivo() {
        return activo;}

    public void setActivo(boolean activo) {
        this.activo = activo;}

    public double getSalarioBase() {
        return salarioBase;}

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;}

    /* Métodos Abstractos */
    abstract public double calcularSalario();

    abstract String obtenerRol();

    /* Métodos Concretos */
    public void activar() {
        if (activo) {
            System.out.println("El empleado ya está activo");
        } else {
            setActivo(true);
            System.out.println("El empleado activo");
        }
    }

    public String mostrarInfo() {
        return "Nombre: "+nombre+" | ID: "+idEmpleado+" | Teléfono: "+telefono+" | Rol: "+obtenerRol()+" | ¿Está activo?: "+(activo ? "Si" : "No")+" | Salario calculado: $"+calcularSalario();
        }

    public void asignarTelefono(String telefono) {
        this.telefono = telefono;
    }
}
