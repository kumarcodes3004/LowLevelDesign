package com.satyam;

import com.satyam.Product.Vehicle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Store {
    int storeId;
    Location storeLocation;
    VehicleInventoryManagement inventoryManagement;
    List<Bookings> bookingsList = new ArrayList<>();

     public void setVehicles(List<Vehicle> vehicleList){
         inventoryManagement = new VehicleInventoryManagement(vehicleList);
     }

     public Bookings createBooking(User user,Vehicle vehicle){
         Bookings booking = new Bookings();
         booking.createBooking(user, vehicle);
         bookingsList.add(booking);

         return booking;
     }

     public boolean completeBooking(int bookingId){
         bookingsList.removeIf(bookings -> bookings.getBookingId()==bookingId);
         return true;
     }
}
