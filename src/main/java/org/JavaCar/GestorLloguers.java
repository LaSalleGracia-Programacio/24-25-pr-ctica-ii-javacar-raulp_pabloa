package org.JavaCar;

import java.util.List;

public class GestorLloguers {
    public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        double total = 0.0;
        for (Llogable llogable : llogables) {
            total += llogable.calcularPreu(dies);//sumar el precio de cada objeto
        }
        return total;
    }
}