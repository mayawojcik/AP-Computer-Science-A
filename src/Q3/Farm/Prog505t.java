package Q3.Farm;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner sydney = new Scanner(new File("Langdat/prog505t.dat"));
            List<Animal> animals = new ArrayList<>();

            while (sydney.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
//Rest in peace farm