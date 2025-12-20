package com.satyam;

/**
 * Hello world!
 *
 */
public class StateDesignTrafficLight
{
    public static void main( String[] args )
    {

        System.out.println( "Welocme to State Design Pattern - Traffic Signal" );

        TrafficLight t1= new TrafficLight();

        t1.change();
        t1.change();
        t1.change();
    }
}
