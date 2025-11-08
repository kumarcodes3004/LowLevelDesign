package com.satyam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
@Setter
public class Location {
    String address;
    int pincode;
    String city;
    String state;
}
