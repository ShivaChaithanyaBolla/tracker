package io.chaithanya.egen.service;

import io.chaithanya.egen.entity.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> LoadAllVehicles(List<Vehicle> vehicles);

    Vehicle findByVIN(String vin);
}
