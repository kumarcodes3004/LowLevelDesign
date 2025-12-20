package com.satyam;

public interface TrafficLightState {

    //in this class we keep all operations that will be used by diff states
    void action(TrafficLight trafficLight);
}
