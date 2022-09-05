package com.lld.bookmyshowlld;

public class Movie {
    Integer id;
    String movie;
    Integer movieDurationInMinutes;

    public Movie(Integer id, String movie, Integer movieDurationInMinutes) {
        this.id = id;
        this.movie = movie;
        this.movieDurationInMinutes = movieDurationInMinutes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public Integer getMovieDurationInMinutes() {
        return movieDurationInMinutes;
    }

    public void setMovieDurationInMinutes(Integer movieDurationInMinutes) {
        this.movieDurationInMinutes = movieDurationInMinutes;
    }
}
