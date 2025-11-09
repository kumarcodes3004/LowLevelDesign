package com.satyam;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class TheatreController {

    Map<City, List<Theatre>> cityVsTheatre;
    List<Theatre> allTheatre;


    TheatreController() {
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }



    void addTheatre(Theatre theatre, City city) {
        allTheatre.add(theatre);

        List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city, theatres);
    }

    void removeTheatre(int id) {
        allTheatre.removeIf(theatre -> theatre.getTheatreId() == id);
    }

    List<Theatre> findTheatreByCity(City city) {
        return cityVsTheatre.get(city);
    }

    Map<Theatre, List<Show>> getAllShows(Movie movie, City city) {
        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        List<Theatre> theatres = findTheatreByCity(city);
        System.out.println("theatres Found\n "+theatres);

        List<Show> showList = new ArrayList<>();


        //IF WE REMOVE THE FIRST PART THEN IN OUR MAP WE WILL HAVE EVEN THOSE THEATRES AS KEY WHERE THE MOVIES IS NOT RUNNING AS EMPTY LIST AGAINST THE THEATRE NAME
        theatreVsShows = theatres.stream()
                .filter(theatre -> theatre.getShowsList().stream()
                        .anyMatch(show -> show.getMovie().getMovieName().equals(movie.getMovieName())))  //first part filters out only those theatres where those movie is running
                .collect(Collectors.toMap(
                        theatre -> theatre,  //key
                        theatre -> theatre.getShowsList().stream(). //value
                                filter(show -> show.getMovie().equals(movie))
                                .collect(Collectors.toList())
                ));

//        for(Theatre theatre:theatres){
//            List<Show> givenMovieShows = new ArrayList<>();
//            List<Show> shows =theatre.getShowsList();
////            System.out.println("Shows "+shows);
//
//            for(Show show:shows){
//                System.out.println("Iterating show in getallshows "+ show +"\n");
//                System.out.println(show.getMovie().getMovieId()==movie.getMovieId());
//                if(show.getMovie().getMovieId()==movie.getMovieId()){
//                    System.out.println("isnide if ");
//                    givenMovieShows.add(show);
//                }
//            }
//            if(!givenMovieShows.isEmpty()){
//                theatreVsShows.put(theatre,givenMovieShows);
//            }
//        }

        return theatreVsShows;


    }
}
