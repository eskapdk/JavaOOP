class VicePresident extends Manager {

    
     VicePresident(String name) {
        super(name,null);
    }

    void sayHello(String name){
        System.out.println("Halo "+name+" Nama Saya Adalah VP "+this.name);
    }
}
