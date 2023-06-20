class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("Halo "+name+" Nama Saya Adalah Employee "+this.name);
    }
}
