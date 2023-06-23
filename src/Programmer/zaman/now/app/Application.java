package Programmer.zaman.now.app;

import Programmer.zaman.now.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 20_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
