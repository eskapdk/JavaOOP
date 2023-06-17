class Person {
    // field
    String nama;
    String address;
    final String country = "Indonesia";

    // Constructor1
    Person(String nama, String address) {
        this.nama = nama;
        this.address = address;
    }

    // Constructor2
    Person(String ParamName) {
        this(ParamName, null);
    }

    // Constructor3
    Person() {
        this(null);
    }

    // method
    void sayHello(String nama) {
        System.out.println("Hallo " + nama + ", Nama saya adalah " + this.nama);
    }
}
