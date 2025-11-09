package com.satyam;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;


@Data
@Component
public class Seat {

    int seatId;
    int row;
    int cost;
    SeatCategory seatCategory;
}
