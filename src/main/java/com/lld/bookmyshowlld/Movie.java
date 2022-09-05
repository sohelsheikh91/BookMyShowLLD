package com.lld.bookmyshowlld;

public class Movie {
    Integer id;
    String movieName;
    Integer movieDurationInMinutes;

    public Movie(Integer id, String movieName, Integer movieDurationInMinutes) {
        this.id = id;
        this.movieName = movieName;
        this.movieDurationInMinutes = movieDurationInMinutes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getMovieDurationInMinutes() {
        return movieDurationInMinutes;
    }

    public void setMovieDurationInMinutes(Integer movieDurationInMinutes) {
        this.movieDurationInMinutes = movieDurationInMinutes;
    }
}
