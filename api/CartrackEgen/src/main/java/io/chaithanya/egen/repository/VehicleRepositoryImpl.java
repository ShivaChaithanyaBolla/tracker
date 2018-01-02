package io.chaithanya.egen.repository;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import io.chaithanya.egen.entity.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public List<Vehicle> getAll() {
        return null;
    }

    public List<Vehicle> LoadAllVehicles(List<Vehicle> vehicles) {

        for(Vehicle vehicle : vehicles){
            if(findByVIN(vehicle.getVin()) != null){
                //update
                entityManager.merge(vehicle);
            }else{
                //create
                entityManager.persist(vehicle);
            }
        }
        return vehicles;
    }

    public Vehicle findByVIN(String vin) {
       return entityManager.find(Vehicle.class, vin);
    }
}
