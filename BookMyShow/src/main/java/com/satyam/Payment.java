package com.satyam;

import org.springframework.stereotype.Component;

@Component
public class Payment {

    int paymentId;
    Booking booking;
    int cost;
}
