package Q3.Farm;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505t.dat"));

            while (file.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
