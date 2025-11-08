package com.satyam;

import com.satyam.Product.Vehicle;
import com.satyam.Product.VehicleType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Component
public class Store {
    int storeId;
    Location storeLocation;
    VehicleInventoryManagement inventoryManagement;
    List<Bookings> bookingsList = new ArrayList<>();

     public void setVehicles(List<Vehicle> vehicleList){
         inventoryManagement = new VehicleInventoryManagement(vehicleList);
     }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
//        Object Vehicle;
         List<Vehicle> result = inventoryManagement.getVehicleList().stream()
                 .filter(vehicle -> vehicle.getVehicleType()==vehicleType)
                 .toList();

         return result;
    }



    public Bookings createBooking(User user,Vehicle vehicle){
         Bookings booking = new Bookings();
         booking.createBooking(user, vehicle);
         bookingsList.add(booking);
        System.out.println("Booking created Successfully");
         return booking;
     }

     public boolean completeBooking(int bookingId){
         bookingsList.removeIf(bookings -> bookings.getBookingId()==bookingId);
         return true;
     }
}
