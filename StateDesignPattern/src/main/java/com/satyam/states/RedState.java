package com.satyam.states;

import com.satyam.TrafficLight;
import com.satyam.TrafficLightState;

public class RedState implements TrafficLightState {

    @Override
    public void action(TrafficLight signal){
        System.out.println("changing state from yellow->red 🚦🚦");

        signal.setState(new GreenState());
    }
}
