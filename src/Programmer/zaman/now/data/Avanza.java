package Programmer.zaman.now.data;

public class Avanza implements Car, IsMaintenance{

public void drive() {
   System.out.println("Mobil Avanza");
}

public int getTier() {
    return 4;
}

public String getBrand() {
    return "Toyota";
}

@Override
public boolean isMaintenance() {
    return false;
}

}
