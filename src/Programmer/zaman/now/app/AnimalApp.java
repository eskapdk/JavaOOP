package Programmer.zaman.now.app;

import Programmer.zaman.now.annotation.Fancy;
import Programmer.zaman.now.data.*;

@Fancy(name = "Animal", tags = {"Application","Java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Cing Clik";
        animal.run();

    }
}
