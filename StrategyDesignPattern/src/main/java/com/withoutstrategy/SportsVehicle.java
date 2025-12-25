package com.withoutstrategy;

public class SportsVehicle extends Vehicle{

    @Override
    public void drive(){
        System.out.println("\n"+this.getClass().getSimpleName()+ ": ");
        System.out.println("Driving mode: Sports");
        //we cant change the behaviour later if we want unless changing the code ->tight coupling
    }
}
