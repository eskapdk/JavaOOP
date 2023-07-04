package Programmer.zaman.now.app;

import Programmer.zaman.now.data.Customer;
import Programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setNama("Eska");
        customer.setLevel(Level.PREMIUM);

        System.out.println("Nama : "+customer.getNama());
        System.out.println("Level : "+customer.getLevel());
        System.out.println("Deskripsi Level : "+customer.getLevel().getString());

        String levelName = Level.PREMIUM.name();
        System.out.println(levelName);

        Level level = Level.valueOf("VIP");
        System.out.println(level); 

        System.out.println("Print level");
        for(var values : Level.values()){
            System.out.println(values);
        }
    }
}
