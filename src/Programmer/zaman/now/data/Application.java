package Programmer.zaman.now.data;

public class Application {
    public static final int PROCESSORS;
    public static final long MEMORY;

    static{
        System.out.println("Mengkases class aplication");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
        MEMORY = Runtime.getRuntime().freeMemory();
    }
}
