package Q2.CL410t;
import java.io.*;
import java.util.*;

public class CL410t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/survey2.dat"));

            System.out.println("ID\t\tIncome\t    Members");
            while (file.hasNext()) {
                int id = file.nextInt();
                int in = file.nextInt();
                int m = file.nextInt();

                cl410 la = new cl410(id, in, m);
                la.setMyMember();
                System.out.println(la.toString());
            }
            System.out.println("Households with income exceeding an average income of ");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
ID		Income	    Members
1041	12180		4
1062	13240		3
1327	19800		2
1483	22458		8
1900	17000		2
2112	18125		7
2345	15623		2
3210	3200		6
3600	6500		5
3601	11970		2
4725	8900		3
6217	10000		2
9280	6200		1
 */
