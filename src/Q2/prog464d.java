package Q2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog464d {
    /**
     * performs matrix transposition on a 2D array of integers.
     * @param mat  The 2D array to be transposed
     * @return     The transposition of <pre>'mat'</pre>'
     */
    public static int[][] transpose(int[][] mat) {
        int[][] transposed = new int[mat[0].length][mat.length];
        for (int row = 0; row < mat.length; row++)
            for (int col = 0; col < mat[0].length; col++)
                transposed[col][row] = mat[row][col];
        return transposed;
    }

    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog464a.dat"));

            int[][] mat = new int[5][5]; // 5 rows, 5 cols
           // Read in matrix in Row-Major Order
           /* for (int c = 0; c < mat[0].length; c++)
                for (int r = 0; r < mat[0].length; r++)
                    mat[r][c] = file.nextInt(); */ //column major format
            for (int r = 0; r < mat[0].length; r++)
                for (int c = 0; c < mat[0].length; c++)
                    mat[r][c] = file.nextInt();

            int[][] mat_T = transpose(mat);

            System.out.println("Original Matrix:");
            for (int[] row: mat) {
                for (int n : row)
                    System.out.print(n + " ");
                System.out.println();
            }

            System.out.println("\nTransposed Matrix:");
            for (int r = 0; r < mat_T.length; r++) {
                for (int c = 0; c < mat_T[0].length; c++)
                    System.out.print(mat_T[r][c] + " ");
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Original Matrix:
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

Transposed Matrix:
45 -3 96 14 19
67 -6 81 -7 43
89 -7 -8 72 28
12 -4 52 29 63
-3 -9 12 -1 87

Process finished with exit code 0

 */