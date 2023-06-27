package Programmer.zaman.now.data;

public class Product {
    
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Nama Produk : "+name+", Harga : "+ price;
    }
}
