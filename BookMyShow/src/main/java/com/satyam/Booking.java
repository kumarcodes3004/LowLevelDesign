package com.satyam;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class Booking {

    int bookingId;
    Show show;
    List<Seat> seatList;
    Payment payment;


}
