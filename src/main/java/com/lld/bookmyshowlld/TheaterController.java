package com.lld.bookmyshowlld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {

    Map<City, List<Theater>> cityViseTheaters;
    List<Theater> allTheaters;

    public TheaterController() {
        cityViseTheaters = new HashMap<>();
        allTheaters = new ArrayList<>();
    }
    void addTheaters(Theater theater, City city){
        allTheaters.add(theater);
        List<Theater> theaters = cityViseTheaters.getOrDefault(city, new ArrayList<>());
        theaters.add(theater);
    }
    Map<Theater, List<Show>> getAllShow(Movie movie, City city) {

        return new HashMap<>();
    }
}
