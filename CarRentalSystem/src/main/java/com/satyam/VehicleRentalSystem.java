package com.satyam;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class VehicleRentalSystem {

    List<User> userList;
    List<Store> storeList;


    //find location based on the location of user
    public Store getStore(Location location){
        return storeList.get(0);
    }
    //CRUD OPERATION TO ADD,REMOVE,UPDATE STORE OR USER
}
