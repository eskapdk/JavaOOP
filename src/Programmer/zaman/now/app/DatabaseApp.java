package Programmer.zaman.now.app;

import Programmer.zaman.now.Error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("eska", "admin");
        System.out.println("Sukses konek ke database");
    }
    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
