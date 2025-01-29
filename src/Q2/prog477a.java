package Q2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prog477a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog477a.dat"));
            int[][] mat = new int[33][2];
            int[][] mat2 = new int[6][3];

            while(input.hasNext()) {
                for (int i = 0; i < mat.length; i++)
                    for (int j = 0; j < mat[0].length; j++)
                        mat[i][j] = input.nextInt();
            }
            
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length-1; j++) {
                    if (mat[i][0] == 1) {
                        if (mat[i][1] == 1) mat2[0][0]++;
                        else if (mat[i][1] == 2) mat2[1][0]++;
                        else if (mat[i][1] == 3) mat2[2][0]++;
                        else if (mat[i][1] == 4) mat2[3][0]++;
                        else mat2[4][0]++;
                    } else {
                        if (mat[i][1] == 1) mat2[0][1]++;
                        else if (mat[i][1] == 2) mat2[1][1]++;
                        else if (mat[i][1] == 3) mat2[2][1]++;
                        else if (mat[i][1] == 4) mat2[3][1]++;
                        else mat2[4][1]++;
                    }
                }
            }

            for (int i = 0; i < mat2.length; i++)
                for (int j = 0; j < mat2[0].length-1; j++) {
                    mat2[i][2] += mat2[i][j];
                }

            for (int i = 0; i < mat2.length-1; i++)
                for (int j = 0; j < mat2[0].length; j++) {
                    mat2[5][j] += mat2[i][j];
                }

            System.out.println("Grade\tMale\tFemale\tTotal");
            for (int i = 0; i < mat2.length-1; i++) {
                String str = "ABCDF";
                System.out.printf("%s\t\t %d\t\t %d\t\t %d\n", str.substring(i, i + 1), mat2[i][0], mat2[i][1], mat2[i][2]);
            }

            System.out.println("----------------------------");
            System.out.printf("Totals:\t%d\t    %d\t    %d", mat2[5][0], mat2[5][1], mat2[5][2]);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Grade	Male	Female	Total
A		 2		 4		 6
B		 4		 4		 8
C		 4		 7		 11
D		 2		 3		 5
F		 3		 0		 3
----------------------------
Totals:	15	    18	    33
 */