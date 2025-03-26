package org.JavaCar;

import java.time.LocalDate;

public class Lloguer {
    private Vehicle vehicle;
    private String clientId;
    private LocalDate dataInici;
    private LocalDate dataFi;
    private double preuPagat;

    // Constructor
    public Lloguer(Vehicle vehicle, String clientId, LocalDate dataInici, LocalDate dataFi, double precioTotal) {
        this.vehicle = vehicle;
        this.clientId = clientId;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.preuPagat = calcularPreuFinal();
    }

    // Calcular el precio final con descuento
    private double calcularPreuFinal() {
        int dies = (int) (dataFi.toEpochDay() - dataInici.toEpochDay());
        double preuTotal = vehicle.calcularPreu(dies);
        if (dies > 7) {
            preuTotal *= 0.9; // Aplicar el 10% de descuento
        }
        return preuTotal;
    }

    // Getters
    public Vehicle getVehicle() { return vehicle; }
    public String getClientId() { return clientId; }
    public LocalDate getDataInici() { return dataInici; }
    public LocalDate getDataFi() { return dataFi; }
    public double getPreuPagat() { return preuPagat; }
}
