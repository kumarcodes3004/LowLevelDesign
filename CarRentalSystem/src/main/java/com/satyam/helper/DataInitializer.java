package com.satyam;

import com.satyam.Product.Vehicle;
import com.satyam.Product.VehicleType;
import com.satyam.Product.Status;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class DataInitializer {

    public static List<User> addUsers() {
        List<User> users = new ArrayList<>();

        User u1 = new User();
        u1.setUserId(1);
        u1.setUserName("Satyam Kumar");
        u1.setUserLicenseNumber("DL2025SAT123");

        User u2 = new User();
        u2.setUserId(2);
        u2.setUserName("Aaryan Singh");
        u2.setUserLicenseNumber("DL2024ARY456");

        User u3 = new User();
        u3.setUserId(3);
        u3.setUserName("Priya Sharma");
        u3.setUserLicenseNumber("DL2025PRI789");

        users.add(u1);
        users.add(u2);
        users.add(u3);

        return users;
    }

    public static List<Vehicle> addVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle v1 = new Vehicle();
        v1.setVehicleId(101);
        v1.setVehicleNumber(5678);
        v1.setVehicleType(VehicleType.CAR);
        v1.setCompany("Tesla");
        v1.setModelName("Model 3");
        v1.setManufacturingDate(new Date(120, 5, 10)); // 2020-06-10
        v1.setAvg(18);
        v1.setCc(2000);
        v1.setDailyRentalCost(4000);
        v1.setHourlyRentalCost(400);
        v1.setNoOfSeats(5);
        v1.setStatus(Status.ACTIVE);

        Vehicle v2 = new Vehicle();
        v2.setVehicleId(102);
        v2.setVehicleNumber(4321);
        v2.setVehicleType(VehicleType.BIKE);
        v2.setCompany("Yamaha");
        v2.setModelName("R15 V4");
        v2.setManufacturingDate(new Date(122, 1, 20)); // 2022-02-20
        v2.setAvg(45);
        v2.setCc(155);
        v2.setDailyRentalCost(1200);
        v2.setHourlyRentalCost(150);
        v2.setNoOfSeats(2);
        v2.setStatus(Status.ACTIVE);

        Vehicle v3 = new Vehicle();
        v3.setVehicleId(103);
        v3.setVehicleNumber(8765);
        v3.setVehicleType(VehicleType.CAR);
        v3.setCompany("Hyundai");
        v3.setModelName("Creta");
        v3.setManufacturingDate(new Date(119, 8, 12)); // 2019-09-12
        v3.setAvg(16);
        v3.setCc(1500);
        v3.setDailyRentalCost(2500);
        v3.setHourlyRentalCost(300);
        v3.setNoOfSeats(5);
        v3.setStatus(Status.ACTIVE);

        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        return vehicles;
    }

//    public static List<Store> addStores(List<Vehicle> vehicles) {
//        List<Store> stores = new ArrayList<>();
//
//        // Create first store
//        Store store1 = new Store();
//        store1.setStoreId(1);
//        store1.setStoreLocation(new Location("Delhi", "Connaught Place", "110001"));
//        store1.setVehicles(vehicles.subList(0, Math.min(2, vehicles.size()))); // assign first 2 vehicles
//
//        // Create second store
//        Store store2 = new Store();
//        store2.setStoreId(2);
//        store2.setStoreLocation(new Location("Mumbai", "Bandra", "400050"));
//        if (vehicles.size() > 2)
//            store2.setVehicles(vehicles.subList(2, vehicles.size())); // remaining vehicles
//
//        stores.add(store1);
//        stores.add(store2);
//
//        return stores;
//    }
}
