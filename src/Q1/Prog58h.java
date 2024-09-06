package Q1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter interest rate: ");
        int R = input.nextInt();
        System.out.println();

        System.out.print("Enter time compounded: ");
        int N = input.nextInt();
        System.out.println();

        System.out.print("Enter days to be kept: ");
        int T = input.nextInt();
        System.out.println();

        System.out.print("Enter amount saved: ");
        int P = input.nextInt();
        System.out.println();

        double amount = P * ((1 + (int)Math.pow(((0.01 * R)/N),(N * T)/365)));


    }
}
