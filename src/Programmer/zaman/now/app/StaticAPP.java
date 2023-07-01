package Programmer.zaman.now.app;

import static Programmer.zaman.now.data.Application.PROCESSORS;
import static Programmer.zaman.now.data.Application.MEMORY;
import static Programmer.zaman.now.data.Constant.*;
import Programmer.zaman.now.data.Country;
import Programmer.zaman.now.util.MathUtil;

public class StaticAPP {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5));

        Country.City city = new Country.City();
        city.setName("Boyolali");
        System.out.println(city.getName());

        System.out.println(PROCESSORS);
        System.out.println(MEMORY);
    }
}
