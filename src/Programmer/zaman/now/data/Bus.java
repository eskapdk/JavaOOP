package Programmer.zaman.now.data;

public class Bus implements Car {

    public void drive() {
        System.out.println("Bus Sekolah");
    }

    public int getTier() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isMaintenance() {
        return false;
    }

    public Boolean isBig() {
        return true;
    }
}
