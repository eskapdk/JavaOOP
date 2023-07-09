package Programmer.zaman.now.app;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable e) {
            System.out.println("Tidak bisa membaca file " + e.getMessage());
        }
    }
}
