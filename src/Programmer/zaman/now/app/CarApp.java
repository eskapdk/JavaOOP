package Programmer.zaman.now.app;

import Programmer.zaman.now.data.Avanza;

public class CarApp {
    public static void main(String[] args) {
        
        var car = new Avanza();
        car.drive();
        System.out.println("Roda : "+car.getTier());
    }
}
