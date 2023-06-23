package Programmer.zaman.now.app;

import Programmer.zaman.now.data.City;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); / Error
        
        var city = new City();
        city.name = "Solo";
        System.out.println(city.name);
    }
}
