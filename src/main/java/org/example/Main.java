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

                    EmpleadoPorHoras empleado = new EmpleadoPorHoras(
                            nombre,
                            idEmpleado,
                            telefono,
                            true,
                            0,
                            horasTrabajadas,
                            valorHora
                    );

                    empleados.add(empleado);
                    System.out.println("¡Empleado agregado correctamente!");
                }

            } catch (InputMismatchException) {}
    }   }

}