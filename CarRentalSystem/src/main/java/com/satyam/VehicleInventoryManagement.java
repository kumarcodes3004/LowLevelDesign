package com.satyam;

import com.satyam.Product.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@AllArgsConstructor
@Component
public class VehicleInventoryManagement {

    List<Vehicle> vehicleList;

    //ALL CRUD OPERATION ,ADD,REMOVE ,UPDATE VEHICLES


    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
//    public List<Vehicle> getVehicleList(){
//        return vehicleList;
//    }

    public void removeVehicle(int vehicleId){

        vehicleList.removeIf(vehicle-> vehicle.getVehicleId()==vehicleId);
    }
}
