package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

public class GestorHistorial {
    private List<Lloguer> historial;

    public GestorHistorial() {
        this.historial = new ArrayList<>();
    }
    // Registrar un nuevo alquiler
    public void registrarLloguer(Lloguer lloguer) {
        historial.add(lloguer);
    }

    // Consultar historial de alquileres por cliente
    public static List<Lloguer> consultarHistorialPorCliente(String clientId) {
        List<Lloguer> resultado = new ArrayList<>();
        for (Lloguer lloguer : historial) {
            if (lloguer.getClientId().equals(clientId)) {
                resultado.add(lloguer);
            }
        }
        return resultado;
    }
    // Consultar historial de alquileres por vehículo
    public List<Lloguer> consultarHistorialPorVehiculo(String matricula) {
        List<Lloguer> resultado = new ArrayList<>();
        for (Lloguer lloguer : historial) {
            if (lloguer.getVehicle().getMatricula().equals(matricula)) {
                resultado.add(lloguer);
            }
        }
        return resultado;
    }
}