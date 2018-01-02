package io.chaithanya.egen.repository;

import io.chaithanya.egen.entity.Vehicle;

import java.util.List;

public interface VehicleRepository {
    List<Vehicle> getAll();

    List<Vehicle> LoadAllVehicles(List<Vehicle> vehicles);

    Vehicle findByVIN(String vin);
}
