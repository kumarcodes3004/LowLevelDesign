package com.satyam;

import org.springframework.stereotype.Component;

@Component
public class Bill {

    Bookings booking;
    boolean isBillPaid;
    Double cost;

    Bill(Bookings booking){
        this.booking=booking;
        this.cost=computeBillAmount();
        isBillPaid=false;
    }

    //we can compute here with help of booking as booking have vehicle -> vehicle have the cost (hourly/daily) and booking have the entire time period for which its booked;
    private Double computeBillAmount() {
        return 1000.0;
    }


}
