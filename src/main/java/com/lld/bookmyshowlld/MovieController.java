package com.lld.bookmyshowlld;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Data
public class MovieController {

    Map<City, List<Movie>> cityViseMovies;
    List<Movie> allMovies;

    public MovieController(Map<City, List<Movie>> cityViseMovies, List<Movie> allMovies) {
        this.cityViseMovies = cityViseMovies;
        this.allMovies = allMovies;
    }
    public void addMovies(City city, Movie movie){

        allMovies.add(movie);
        List<Movie> movies = cityViseMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityViseMovies.put(city, movies);

    }
    public Movie getMovieByName(String movieName){

        for(Movie movie : allMovies){

            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }
    public List<Movie> getMovieByCity(City city){
        return cityViseMovies.get(city);
    }
    //Crud operations - Update, Delete.
}
