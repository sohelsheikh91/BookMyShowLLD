package com.lld.bookmyshowlld;

public class BookMyShow {
    MovieController movieController;
    TheaterController theaterController;

    public BookMyShow(MovieController movieController, TheaterController theaterController) {
        this.movieController = movieController;
        this.theaterController = theaterController;
    }

}
