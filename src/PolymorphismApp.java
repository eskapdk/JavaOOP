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

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) { // check tipe data
            VicePresident vicePresident = (VicePresident) employee; // cast/konversi tipe data
            System.out.println("Halo VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Halo Manager " + manager.name);
        } else {
            System.out.println("Halo " + employee.name);
        }

    }
}
