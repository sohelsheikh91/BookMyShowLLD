package com.lld.bookmyshowlld;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    int theaterId;
    String Address;
    City city;
    List<Screen> screens = new ArrayList<>();
    List<Show> shows = new ArrayList<>();

    public Theater(int theaterId, String address, City city) {
        this.theaterId = theaterId;
        Address = address;
        this.city = city;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
