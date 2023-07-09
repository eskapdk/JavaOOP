package Programmer.zaman.now.app;

import Programmer.zaman.now.Error.ValidationException;
import Programmer.zaman.now.data.LoginRequest;
import Programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException exception) {
            System.out.println("data tidak valid : " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("data tidak valid : " + exception.getMessage());
        }

        LoginRequest loginRequest2 = new LoginRequest("ratih", "");

        try {
            ValidationUtil.validate(loginRequest2);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("data tidak valid : " + exception.getMessage());
        } 

        LoginRequest loginRequest3 = new LoginRequest(null, "rahasia");

        try {
            ValidationUtil.validate(loginRequest3);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Error gak error tetap dieksekusi");
        }


        LoginRequest loginRequest4 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest4);
    }
}
