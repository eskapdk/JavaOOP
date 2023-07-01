package Programmer.zaman.now.app;

import Programmer.zaman.now.data.Helloworld;

public class HelloWorldApp {
    public static void main(String[] args) {

        Helloworld english = new Helloworld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        Helloworld indonesia = new Helloworld() {
            public void sayHello() {
                System.out.println("Halo");
            }

            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Eska");

        indonesia.sayHello();
        indonesia.sayHello("Eska");
    }
}
