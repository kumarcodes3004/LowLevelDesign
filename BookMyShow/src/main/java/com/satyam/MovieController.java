package com.satyam;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@AllArgsConstructor
@Component
public class MovieController {
    Map<City, List<Movie>> cityVsMovies;
    List<Movie> allMovies;

    MovieController(){
        cityVsMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie,City city){
        allMovies.add(movie);

        List<Movie> movies =cityVsMovies.getOrDefault(city,new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city,movies);
    }

    public Movie getMovieByName(String movieName){
        return allMovies.stream()
                .filter(movie->movie.getMovieName().equals(movieName))
                .findFirst()
                .orElse(null);

//        return m1;
    }

    List<Movie> findMovieByCity(City city){
        return cityVsMovies.get(city);
    }

    public void removeMovie(int id){
        allMovies.removeIf(movie -> movie.getMovieId()==id);
    }
}
