package Programmer.zaman.now.app;

import Programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        
        var category = new Category();

        category.setId("IDI");
        System.out.println(category.getId());

    }
}
