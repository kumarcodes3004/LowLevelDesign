package com.withstrategypattern.drivestrategy;

public class NormalDrive implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Drive capability: Normal");
    }

}
