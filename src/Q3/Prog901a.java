package Q3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog901a {
    public static void main(String[] args) {
        try {
            Scanner sydney = new Scanner(new File("Langdat/prog512h.dat"));

            while (sydney.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
