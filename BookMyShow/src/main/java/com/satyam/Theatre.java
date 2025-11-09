package com.satyam;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
@ToString
public class Theatre {
    int theatreId;
    String address;
    City city;
    List<Show> showsList;
    List<Screen> screenList;





}
