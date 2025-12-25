package com.withstrategypattern;

import com.withstrategypattern.drivestrategy.OffRoadDrive;
import com.withstrategypattern.drivestrategy.SportsDrive;
import com.withstrategypattern.vehicle.OffRoadVehicle;
import com.withstrategypattern.vehicle.SportsVehicle;

public class Demo {

    public static void main(String[] args) {
        Vehicle v1 = new SportsVehicle(new SportsDrive());
        Vehicle v2 = new OffRoadVehicle(new OffRoadDrive());

        v1.drive();
        v2.drive();
    }
}
