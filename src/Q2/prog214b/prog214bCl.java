package Q2.prog214b;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog214bCl {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214b.dat"));

            while (file.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
