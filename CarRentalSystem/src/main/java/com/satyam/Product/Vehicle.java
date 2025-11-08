package com.satyam.Product;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@Component
public class Vehicle {
    int vehicleId;
    int vehicleNumber;
    VehicleType vehicleType;
    int kmDriven;
    String company;
    String modelName;
    Date manufacturingDate;
    int avg;
    int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeats;
    Status status;


}
