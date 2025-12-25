package com.withoutstrategy;

public class Vehicle {

    public void drive(){
        System.out.println("\n"+this.getClass().getSimpleName()+ ": ");
        System.out.println("Driving mode: Normal");
    }
}
