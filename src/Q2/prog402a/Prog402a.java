package Q2.prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prg402a.dat"));
              System.out.println("ID\t\tScore   \tDiff");

            while (file.hasNext()) {
                int myID = file.nextInt();
                int myScore = file.nextInt();
                System.out.println(myID + "\t\t" + myScore);

            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
