class Person {
    String nama;
    String address;
    final String country = "Indonesia";

    void sayHello(String ParamName) {
        System.out.println("Hallo " + ParamName + ", Nama saya adalah " + nama);
    }

    Person(String ParamName, String ParamAdd) {
        nama = ParamName;
        address = ParamAdd;
    }

    Person(String ParamName) {
        this(ParamName, null);
    }

    Person() {
        this(null);
    }
}
