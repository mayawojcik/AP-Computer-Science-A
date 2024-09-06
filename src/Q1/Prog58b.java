package Q1;
import java.util.*;

public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int A = input.nextInt();
        System.out.println();

        System.out.print("Enter second number: ");
        int B = input.nextInt();
        System.out.println();

        System.out.print("Enter third number: ");
        int C = input.nextInt();
        System.out.println();

        // positive root
        int pRoot = (-B + (int)Math.pow(B, 2) - (4 * A * C)) / (2 * A);

        // negative root
        int nRoot = (-B - (int)Math.pow(B, 2) - (4 * A * C)) / (2 * A);
        System.out.println("Roots: " + pRoot + "," + nRoot);
        //add square root
    }
}
