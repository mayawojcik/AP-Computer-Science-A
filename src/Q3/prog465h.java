package Q3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465h.dat"));
            while (input.hasNext()) {
                int row = input.nextInt();
                int col = input.nextInt();
                int[][] mat = new int[row][col];

                int count = 0;
                for (int i = 0; i < mat.length; i++)
                    for (int j = 0; j < mat[0].length; j++) {
                        mat[i][j] = input.nextInt();
                        if (mat[i][j] != 0)
                        count++;
                    }
                
                int[][] mat2 = new int[count][3];
                int count2 = 0;
                for (int i = 0; i < mat.length; i++)
                    for (int j = 0; j < mat[0].length; j++)
                        if (mat[i][j] != 0) {
                            mat2[count2][0] = i++;
                            mat2[count2][1] = j++;
                            mat2[count2][2] = mat[i][j];
                            count2++;
                        }
                
                System.out.println("Original Matrix!!");
                for (int[] i : mat) {
                    for (int num : i)
                        System.out.print(num + "\t");
                    System.out.println();
                }
                System.out.println();

                for (int[] i : mat2) {
                    for (int num : i)
                        System.out.print(num + "\t");
                    System.out.println();
                }
                System.out.println();

                if (count2 * 3 < row * col)
                    System.out.println("The original matrix is sparse!");
                else if (count2 * 3 > row * col)
                    System.out.println("The original matric is abundant!!");
                else
                    System.out.println("The original matrix and the sparse matrix are both equally efficient!!");
                System.out.println();   
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
