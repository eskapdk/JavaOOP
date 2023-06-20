public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Eska");
        employee.sayHello("ratih");

        employee = new Manager("Eska");
        employee.sayHello("ratih");

        employee = new VicePresident("Eska");
        employee.sayHello("ratih");


        sayHello(new Employee("Eska"));
        sayHello(new Manager("Ratih"));
        sayHello(new VicePresident("Bayu"));
    }

    static void sayHello(Employee employee){
        System.out.println("Halo "+employee.name);
    }
}
