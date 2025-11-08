package com.satyam;

import org.springframework.stereotype.Component;

@Component
public enum BookingStatus {
    BOOKED,
    INPROGRESS,
    COMPLETED,
    CANCELLED;
}
