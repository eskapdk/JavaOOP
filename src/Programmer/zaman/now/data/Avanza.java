package Programmer.zaman.now.data;

public class Avanza implements Car{

public void drive() {
   System.out.println("Mobil Avanza");
}

public int getTier() {
    return 4;
}

public String getBrand() {
    return "Toyota";
}

public boolean isMaintenance() {
    return false;
}

}
