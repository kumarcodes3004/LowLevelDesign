package com.withstrategypattern.drivestrategy;

public class OffRoadDrive implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Drive capability: OffRoad");
    }
}
