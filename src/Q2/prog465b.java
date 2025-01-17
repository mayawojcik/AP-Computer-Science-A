package Q2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465b.dat"));
            int[][] mat = new int[3][4];
            int[] arr = new int[12];

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }

            int count = 0;
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    if (mat[r][c] < 100) {
                        arr[count] = r + 1;
                        count++;
                        arr[count] = c + 1;
                        count++;
                    }
                }
            }

            System.out.println("Original Table");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Numbers Less Than 100!!!");
            System.out.println("Row\t\tColumn");

            for (int lcv = 0; lcv < count; lcv += 2) {
                System.out.println(arr[lcv] + "\t\t" + arr[lcv + 1]);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Original Table
100 195 182 225
83  125 235 67
129 42  100 750

Numbers Less Than 100!!!
Row		Column
2		1
2		4
3		2
 */