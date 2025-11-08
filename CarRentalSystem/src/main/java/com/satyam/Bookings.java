package com.satyam;

import com.satyam.Product.Vehicle;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@ToString
@Component
public class Bookings {

    int bookingId;
    User user;
    Vehicle vehicle;
    Date bookingdate;
    Date bookingStartDate;
    Date bookingEndDate;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickupLocation;
    Location dropLocation;
    BookingType bookingType;
    BookingStatus bookingStatus;

    public int createBooking(User user,Vehicle vehicle){
        //create new unique
        System.out.println("Creating a new booking for USer: "+user.getUserName() + "With vehicle: "+vehicle.getModelName());
        bookingId =1001;
        this.user=user;
        this.vehicle=vehicle;
        bookingType = BookingType.DAILY;
        bookingStatus = BookingStatus.BOOKED;


        return bookingId;
    }
}
