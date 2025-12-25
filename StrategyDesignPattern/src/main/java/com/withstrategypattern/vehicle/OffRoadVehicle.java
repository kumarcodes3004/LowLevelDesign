package com.withstrategypattern.vehicle;

import com.withstrategypattern.Vehicle;
import com.withstrategypattern.drivestrategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }

}
