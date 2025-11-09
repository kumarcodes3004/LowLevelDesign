package com.satyam;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Builder
@ToString
public class Movie {
    int movieId;
    String movieName;
    int movieDurationInMinutes;



}
