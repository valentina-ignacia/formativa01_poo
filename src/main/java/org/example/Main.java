package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* Creación ArrayList Empleado */
        ArrayList<Empleado>  empleados = new ArrayList<>();

        while (true) {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Agregar Empleado por Horas");
            System.out.println("2. Agregar Empleado Asalariado");
            System.out.println("3. Agregar Gerente");
            System.out.println("4. Mostrar todos los empleados");
            System.out.println("5. Activar o desactivar empleado");
            System.out.println("6. Mostrar nómina total");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                int opcion = sc.nextInt();

                /* Agregar empleado x horas */
                if (opcion == 1) {

                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese ID: ");
                    String idEmpleado = sc.nextLine();

                    System.out.print("Ingrese teléfono: ");
                    String telefono = sc.nextLine();

                    System.out.print("Ingrese horas trabajadas: ");
                    int horasTrabajadas = sc.nextInt();

                    System.out.print("Ingrese valor por hora: ");
                    double valorHora = sc.nextDouble();

                    EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(
                            nombre,
                            idEmpleado,
                            telefono,
                            true,
                            0,
                            horasTrabajadas,
                            valorHora
                    );

                    empleados.add(empleadoPorHoras);
                    System.out.println("¡Empleado agregado correctamente!");

                /* Agregar empleado asalariado */
                } else if (opcion == 2) {
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese ID: ");
                    String idEmpleado = sc.nextLine();

                    System.out.print("Ingrese teléfono: ");
                    String telefono = sc.nextLine();

                    System.out.print("Ingrese sueldo mensual: ");
                    double sueldoMensual = sc.nextDouble();

                    EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
                            nombre,
                            idEmpleado,
                            telefono,
                            true,
                            sueldoMensual
                    );

                    empleados.add(empleadoAsalariado);
                    System.out.println("¡Empleado agregado correctamente!");

                } else if (opcion == 3) {
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese ID: ");
                    String idEmpleado = sc.nextLine();

                    System.out.print("Ingrese teléfono: ");
                    String telefono = sc.nextLine();

                    System.out.print("Ingrese sueldo mensual: ");
                    double sueldoMensual = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Ingrese departamento: ");
                    String departamento = sc.nextLine();

                    System.out.print("Ingrese meta de desempeño: ");
                    double metaDesempeno = sc.nextDouble();
                    sc.nextLine();

                    Gerente gerente = new Gerente(
                            nombre,
                            idEmpleado,
                            telefono,
                            true,
                            sueldoMensual,
                            departamento,
                            0,
                            metaDesempeno
                    );

                    empleados.add(gerente);
                    System.out.println("¡Gerente agregado correctamente!");
                /* Recorrer todos los empleados de la lista */
                } else if (opcion == 4) {

                    if (empleados.isEmpty() ) {
                        System.out.println("¡Aún no hay empleados registrados!");
                    } else {
                        for (int i = 0; i < empleados.size(); i++) {
                            System.out.println(i+". " + empleados.get(i).getNombre());
                            System.out.println("-----------------------------");
                        }
                    }
                /* Acticar o desactivar empleado */
                } else if (opcion == 5) {
                    if (empleados.isEmpty() ) {
                        System.out.println("¡Aún no hay empleados registrados!");
                    } else {
                        System.out.print("Ingrese el índice del empleado: ");
                        int indice = sc.nextInt();

                        if (indice >= 0 && indice < empleados.size()) {
                            Empleado empleado = empleados.get(indice);
                            if (empleado.isActivo()) {
                                empleado.desactivar();
                                System.out.println("¡Empleado desactivado correctamente!");
                            } else {
                                empleado.activar();
                                System.out.println("¡Empleado activado correctamente!");
                            }
                        } else {
                            System.out.println("¡Índice fuera de rango!");
                        }
                    }
                /* Mostrar nómina total */
                } else if (opcion == 6) {
                    double nominaTotal = 0;
                    for (Empleado empleado : empleados) {
                        nominaTotal = empleado.calcularSalario();
                    }
                    System.out.println("Nomina total: $" + nominaTotal);

                } else if (opcion == 7) {
                    System.out.println("Programa finalizado.");
                    break;

                } else {
                    System.out.println("¡Opción inválida!");
                }

            } catch (InputMismatchException e) {
                System.out.println("¡Debe ingresar un número!");
            }
    }   }

}