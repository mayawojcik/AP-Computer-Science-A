package Q2.prog402a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prg402a.dat"));
// 21 pairs                System.out.println("ID\t\tScore\t\tDiff");
            int ID = 0;
            int Score = 0;
            while (file.hasNext()) {
                int myID = file.nextInt();


            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
