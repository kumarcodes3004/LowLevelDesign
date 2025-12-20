package com.satyam;

import com.satyam.states.RedState;

public class TrafficLight {

    private TrafficLightState state;

    //constructor, setting initial state ->red
    public TrafficLight(){
        this.state=new RedState();
    }

    public void setState(TrafficLightState state){
        this.state =state;
    }

    public void change(){
        state.action(this);
    }
}
