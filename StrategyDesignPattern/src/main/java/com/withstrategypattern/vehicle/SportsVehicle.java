package com.withstrategypattern.vehicle;

import com.withstrategypattern.Vehicle;
import com.withstrategypattern.drivestrategy.DriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
