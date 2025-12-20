package com.satyam.states;

import com.satyam.TrafficLight;
import com.satyam.TrafficLightState;

public class YellowState implements TrafficLightState {

    @Override
    public void action(TrafficLight trafficLight) {
        System.out.println("changing state from red ->yellow🚦🚦");
        trafficLight.setState(new RedState());
    }
}
