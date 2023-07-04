package Programmer.zaman.now.app;

import Programmer.zaman.now.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Eska", "rahasia");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
    
        System.out.println(new LoginRequest("Ratih"));
        System.out.println(new LoginRequest("Ratih","Enggak ada"));
        
    }
}
