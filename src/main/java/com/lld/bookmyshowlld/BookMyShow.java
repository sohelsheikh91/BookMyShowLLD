package com.lld.bookmyshowlld;

public class BookMyShow {
    MovieController movieController;
    TheaterController theaterController;

    public BookMyShow(MovieController movieController, TheaterController theaterController) {
        this.movieController = movieController;
        this.theaterController = theaterController;
    }
    void initialize(){
        createMovies();
        createTheaters();
    }

    private void createTheaters() {


    }

    public void createMovies() {
        Movie avengers = new Movie(1, "avengers",180);
        Movie baahubali = new Movie(2, "Baahubali", 128);

        movieController.addMovies(City.Mumbai, avengers);
    }


}
