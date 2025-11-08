package com.satyam;

import com.satyam.Product.Vehicle;
import com.satyam.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

import static com.satyam.DataInitializer.addUsers;
import static com.satyam.DataInitializer.addVehicles;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Welcome To car rental system" );

        List<User> users =addUsers();
        List<Vehicle> vehicles=addVehicles();
        List<Store> stores =addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(users,stores);

        User user =users.get(0);
        Location location = new Location("RMV",560054,"Bangalore","Karnataka");
       Store store1 = rentalSystem.getStore(location);

//       List<Vehicle> storeVehicles = store1.inventoryManagement.getVehicleList();
        List<Vehicle> storeVehicles = store1.getVehicles(VehicleType.CAR);

       for(Vehicle v1 :storeVehicles){
           System.out.println(v1);
       }

       Bookings booking = store1.createBooking(user,storeVehicles.get(1));

       List<Bookings> bookings = store1.getBookingsList();
        for(Bookings b1 :bookings){
            System.out.println(b1);
        }

       Bill bill1 = new Bill(booking);
       Payment payment= new Payment();
       payment.payBill(bill1);

       store1.completeBooking(booking.bookingId);
        List<Bookings> bookings1 = store1.getBookingsList();
        System.out.println(bookings1);

    }

    public static List<Store> addStores(List<Vehicle> vehicles){

        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }

}
