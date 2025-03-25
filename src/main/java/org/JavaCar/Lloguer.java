package org.JavaCar;

import java.time.LocalDate;

public class Lloguer {
    private Vehicle vehicle;
    private String clientId;
    private LocalDate dataInici;
    private LocalDate dataFi;
    private double preuPagat;

    // Constructor
    public Lloguer(Vehicle vehicle, String clientId, LocalDate dataInici, LocalDate dataFi, double preuPagat) {
        this.vehicle = vehicle;
        this.clientId = clientId;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.preuPagat = preuPagat;
    }

    // Getters
    public Vehicle getVehicle() { return vehicle; }
    public String getClientId() { return clientId; }
    public LocalDate getDataInici() { return dataInici; }
    public LocalDate getDataFi() { return dataFi; }
    public double getPreuPagat() { return preuPagat; }
}