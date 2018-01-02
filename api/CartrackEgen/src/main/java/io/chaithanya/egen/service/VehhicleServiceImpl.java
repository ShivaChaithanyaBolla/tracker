package io.chaithanya.egen.service;

import io.chaithanya.egen.entity.Vehicle;
import io.chaithanya.egen.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehhicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> getAll(){
        return vehicleRepository.getAll();
    }

    @Transactional
    public List<Vehicle> LoadAllVehicles(List<Vehicle> vehicles) {
        return vehicleRepository.LoadAllVehicles(vehicles);
    }

    @Transactional(readOnly = true)
    public Vehicle findByVIN(String vin) {
        return vehicleRepository.findByVIN(vin);
    }
}
