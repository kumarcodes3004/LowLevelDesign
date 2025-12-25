package com.withoutstrategy;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive(){
        System.out.println("\n"+this.getClass().getSimpleName()+ ": ");
        System.out.println("Driving mode: Sports"); //offroad have sports mode as well
    }
}
