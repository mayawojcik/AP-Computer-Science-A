package Q3;
import java.util.Scanner;

public class MSOE2022_5 {
    public static void main(String[] args) {
        Scanner marlon = new Scanner(System.in);
        int grams = 0;
        int buckets = 0;
        System.out.println("How many shells would you like? ");
        int shells = marlon.nextInt();
        for (int m = 0; m < shells; m++) {
            System.out.println("How many grams??");
            grams += marlon.nextInt();
        }
        while (grams > 0) {
            buckets++;
            grams -= 100;
        }
        System.out.println("Sally needs" + buckets + "buckets");

    }
}
