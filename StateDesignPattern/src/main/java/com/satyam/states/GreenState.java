package com.satyam.states;

import com.satyam.TrafficLight;
import com.satyam.TrafficLightState;

public class GreenState implements TrafficLightState {

    @Override
    public void action(TrafficLight signal) {
        System.out.println("Changing state from red->green 🚦🚦");
        signal.setState(new YellowState());
    }
}
