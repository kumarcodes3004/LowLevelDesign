package com.withstrategypattern.drivestrategy;

public class SportsDrive implements DriveStrategy {

    @Override
    public void drive(){
        System.out.println("Drive capability: Sports");
    }
}
