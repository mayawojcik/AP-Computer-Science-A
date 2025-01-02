package Q2.prog215i;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class cl215i {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog215i.dat"));

            while (file.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
