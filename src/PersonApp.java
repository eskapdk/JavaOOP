public class PersonApp {
    public static void main(String[] args) {
        var Person1 = new Person("Eska", "Boyolali");

        System.out.println(Person1.nama);
        System.out.println(Person1.address);
        System.out.println(Person1.country);
        Person1.sayHello("Ratih");

        Person Person2 = new Person("Ratih");
        System.out.println(Person2);

        Person Person3;
        Person3 = new Person();
        Person3.nama = "Bayu";
        Person3.sayHello("Joko");

        
    }
}
