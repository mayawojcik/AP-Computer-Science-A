package Q1;
import java.util.Scanner;

public class LP55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String num = input.nextLine();

        for (int lcv = 0; lcv < num.length(); lcv++) {
            for (int lcv2 = lcv + 1; lcv2 < num.length(); lcv2++) {
                for (int lcv3 = lcv + 2; lcv3 < num.length(); lcv3++) {
                    String let1 = num.substring(lcv, lcv + 1);
                    String let2 = num.substring(lcv2, lcv2 + 1);
                    String let3 = num.substring(lcv3, lcv3 + 1);

                    System.out.println(let1);
                    System.out.println(let2);
                    //System.out.println(let3);
                }
            }
        }
    }
}
/*
Enter a positive integer: 456
4
5
4
6
 */