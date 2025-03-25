package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

public class GestorLloguers {
    public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        double total = 0.0;

        // Recorremos la lista usando el parámetro correcto
        for (Vehicle vehicle : vehicles) {
            total += vehicle.calcularPreu(dies); // Sumar el precio de cada objeto
        }

        return total; // Devolver el total calculado
    }
    // Filtra vehicles amb preu igual o inferior al preu màxim especificat
    public static List<Vehicle> filtrarPerPreu(List<Vehicle> vehicles, double preuMax, int dies) {
        List<Vehicle> vehiclesFiltrats = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.calcularPreu(dies) <= preuMax) {
                vehiclesFiltrats.add(vehicle);
            }
        }
        return vehiclesFiltrats;
    }
}
