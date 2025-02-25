package Q3.Prog702p;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog701g.dat"));

            while (file.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
