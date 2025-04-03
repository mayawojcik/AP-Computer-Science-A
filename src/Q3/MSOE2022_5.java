package Q3;
import java.util.Scanner;

public class MSOE2022_5 {
    public static void main(String[] args) {
        Scanner sydney = new Scanner(System.in);
        int grams = 0;
        int buckets = 0;
        System.out.println("How many shells would you like? ");
        int shells = sydney.nextInt();
        for (int m = 0; m < shells; m++) {
            System.out.println("How many grams??");
            grams += sydney.nextInt();
        }
        while (grams > 0) {
            buckets++;
            grams -= 100;
        }
        System.out.println("Sally needs " + buckets + " bucket(s)");

    }
}
/*
How many shells would you like?
5
How many grams??
77
How many grams??
656
How many grams??
3
How many grams??
1
How many grams??
5
Sally needs 8 bucket(s)
 */