package org.JavaCar;
import java.time.LocalDate;

public class Alquiler {

    private Vehicle vehiculo;    // Vehículo alquilado
    private String cliente;      // Nombre o ID del cliente
    private LocalDate fechaInicio;  // Fecha de inicio del alquiler
    private LocalDate fechaFin;     // Fecha de fin del alquiler
    private double precioTotal;     // Precio del alquiler

    public Alquiler(Vehicle vehiculo, String cliente, LocalDate fechaInicio, LocalDate fechaFin) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = calcularPrecio();
    }

}
