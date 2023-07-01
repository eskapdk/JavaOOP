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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product product = (Product) obj;

        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }
}
