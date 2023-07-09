package Programmer.zaman.now.app;

import Programmer.zaman.now.data.CreateUserRequest;
import Programmer.zaman.now.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Eska");
        request.setPassword("password");
        ValidationUtil.validationReflection(request);
    }
}
