package Programmer.zaman.now.data;

public interface Car extends HasBrand,IsMaintenance {
    void drive();
    int getTier();

    default Boolean isBig(){
        return false;
    }
}
