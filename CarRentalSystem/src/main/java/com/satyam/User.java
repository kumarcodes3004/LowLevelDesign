package com.satyam;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class User {
    int userId;
    String userName;
    String userLicenseNumber;
}
