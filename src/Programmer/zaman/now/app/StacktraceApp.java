package Programmer.zaman.now.app;

public class StacktraceApp {
    public static void main(String[] args) {

        try {
            sampleError();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Eska", "Pratama", "Dian", "Kurniawan"
            };
            System.out.println(names[10]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);

        }
    }
}
