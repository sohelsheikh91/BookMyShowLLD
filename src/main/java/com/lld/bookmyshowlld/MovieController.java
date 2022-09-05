package com.lld.bookmyshowlld;

import java.util.List;
import java.util.Map;

public class MovieController {

    Map<City, List<Movie>> cityViseMovies;
    List<Movie> allMovies;

    public MovieController(Map<City, List<Movie>> cityViseMovies, List<Movie> allMovies) {
        this.cityViseMovies = cityViseMovies;
        this.allMovies = allMovies;
    }
}
