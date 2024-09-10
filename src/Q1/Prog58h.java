package Q1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter rate of interest:");
        double r = input.nextDouble();

        System.out.print("Enter amount of days compounded:");
        double n = input.nextDouble();

        System.out.print("Enter amount of days money should be saved:");
        double t = input.nextDouble();

        System.out.print("Enter amount originally saved:");
        double p = input.nextDouble();

        double r_over_n = ((0.01 * r)/ n);
        double e = (n * t)/365;
        double A = (p * ( 1 + (int)Math.pow(r_over_n, e)));
        System.out.print("Amount in savings now: " + A);
    }
}
