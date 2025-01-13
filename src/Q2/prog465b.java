package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465b {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465b.dat"));

            int[][] mat = new int[3][4]; //3 rows 4 columns
            for (int r = 0; r < mat[0].length; r++)
                for (int c = 0; c < mat[0].length; c++)
                    mat[r][c] = file.nextInt();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
