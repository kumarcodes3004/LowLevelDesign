package com.satyam;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Screen {

    int screenId;
    List<Seat> seatList;

    @Override
    public String toString() {
        return "Screen-" + screenId;
    }
}
