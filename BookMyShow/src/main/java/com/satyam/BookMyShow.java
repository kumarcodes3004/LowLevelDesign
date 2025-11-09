package com.satyam;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//@AllArgsConstructor
@Component
public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;

    BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController( );
    }


    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialize();

        bookMyShow.createBooking(City.BANGALORE,"Stree");
        bookMyShow.createBooking(City.BANGALORE,"Stree");

    }

    private void createBooking(City userCity,String movieName){

        List<Movie> movies = movieController.findMovieByCity(userCity);
        System.out.println(movies);
        Movie intrestedMovie =null;

        for(Movie movie:movies){
            if(movie.getMovieName().equals(movieName)){
                intrestedMovie=movie;
            }
        }
        System.out.println("Intrested movies is "+ intrestedMovie);
        Map<Theatre ,List<Show>> showTheatreWise = theatreController.getAllShows(intrestedMovie,userCity);
        System.out.println("Shopws according to theatre \n"+showTheatreWise);

        //4. select the particular show user is interested in
        Map.Entry<Theatre,List<Show>> entry = showTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show intrestedShow = runningShows.get(0);

        int seatNumber =30;

        List<Integer> bookedSeats = intrestedShow.getBookedSeatsId();

        if(!bookedSeats.contains(seatNumber)){
            bookedSeats.add(seatNumber);
            Booking booking = new Booking();
            List<Seat> mybookedSeats = new ArrayList<>();
            for(Seat s1 : intrestedShow.getScreen().getSeatList()){
                if(s1.getSeatId()==seatNumber){
                    mybookedSeats.add(s1);
                }
            }
            booking.setShow(intrestedShow);
            booking.setBookingId(222);
            booking.setSeatList(mybookedSeats);
        }else{
            System.out.println("Seat already booked try some other seat");
            return;
        }
        System.out.println("Booking Successful");
    }

    private void initialize(){
        createMovies();
        createTheatre();
    }

    private void createMovies() {
        Movie maddock =Movie.builder()
                .movieId(1001)
                .movieName("Stree")
                .movieDurationInMinutes(128)
                .build();

        Movie hollywood = Movie.builder()
                .movieId(1002)
                .movieName("Final Destination")
                .movieDurationInMinutes(110)
                .build();

        movieController.addMovie(maddock,City.BANGALORE);
        movieController.addMovie(maddock,City.PATNA);
        movieController.addMovie(hollywood,City.BANGALORE);
        movieController.addMovie(hollywood,City.PATNA);

    }

    private void createTheatre() {

        Movie maddockMovie = movieController.getMovieByName("Stree");
        Movie hollyMovie = movieController.getMovieByName("Final Destination");


        Theatre inox = new Theatre();
        inox.setTheatreId(1);
        inox.setCity(City.BANGALORE);
        inox.setScreenList(createScreen());
        List<Show> inoxShows = new ArrayList<>();
        Show inoxNoonShow = createShows(1,inox.getScreenList().get(0),maddockMovie,13);
        Show inoxEveningShow = createShows(2,inox.getScreenList().get(0),hollyMovie,18);
        inoxShows.add(inoxEveningShow);
        inoxShows.add(inoxNoonShow);
        inox.setShowsList(inoxShows);

        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setTheatreId(2);
        pvrTheatre.setScreenList(createScreen());
        pvrTheatre.setCity(City.PATNA);
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(3, pvrTheatre.getScreenList().get(0), maddockMovie, 13);
        Show pvrEveningShow = createShows(4, pvrTheatre.getScreenList().get(0), hollyMovie, 20);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShowsList(pvrShows);

        theatreController.addTheatre(inox,City.BANGALORE);
        theatreController.addTheatre(pvrTheatre,City.PATNA);

    }

    private List<Screen> createScreen(){
        List<Screen> screens = new ArrayList<>();
        Screen s1 = new Screen();
        s1.setScreenId(1);
        s1.setSeatList(createSeats());
        screens.add(s1);

        return screens;
    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }


    private List<Seat> createSeats(){
        List<Seat> seats = new ArrayList<>();

        for(int i=0;i<40;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }
        for(int i=40;i<80;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }
        for(int i=80;i<100;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PALTINUM);
            seats.add(seat);
        }

        return seats;
    }

}
