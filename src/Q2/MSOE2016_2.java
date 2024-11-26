package Q2;
import java.util.*;

public class MSOE2016_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is side a? ");
        double a = input.nextDouble();
        System.out.println("What is side c? ");
        double c = input.nextDouble();
        System.out.println("Degree of angle a? ");
        double alp = input.nextDouble();
        double g = Math.toDegrees(Math.asin(c/a*Math.sin(Math.toRadians(alp)))); // Okay for competitors to assume asin argument <= 1
        double g2 = 180-g;
        if (alp+g < 180) {
            System.out.printf("The two values for angle C: %g and %g.\n", g, g2);
        } else {
            System.out.printf("One value for angle C: %g.\n", g);
        }
    }
}
/*
What is side a?
54
What is side c?
38
Degree of angle a?
164
The two values for angle C: 11.1844 and 168.816.
 */