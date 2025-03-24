package org.JavaCar;

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
}
