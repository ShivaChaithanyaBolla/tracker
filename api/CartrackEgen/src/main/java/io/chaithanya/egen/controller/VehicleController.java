package io.chaithanya.egen.controller;

import io.chaithanya.egen.entity.Vehicle;
import io.chaithanya.egen.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.PUT, value="/vehicles",
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> LoadAllVehicles(@RequestBody List<Vehicle> vehicles){

         return vehicleService.LoadAllVehicles(vehicles);
    }
}
