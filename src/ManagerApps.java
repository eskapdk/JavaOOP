public class ManagerApps {

    public static void main(String[] args) {
        var manager = new Manager("Eska");
        manager.sayHello("Ratih");

        var vp = new VicePresident("Eska");
        vp.sayHello("Bayu");

        System.out.println(manager);
        System.out.println(vp);

         System.out.println(manager.toString());
        System.out.println(vp.toString());
    }

    
}
