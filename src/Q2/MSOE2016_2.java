package Q2;
import java.util.*;

public class MSOE2016_2 {
    public static void p2() {
        System.out.println("Side a? ");
        double a = input.nextDouble();
        System.out.println("Side c? ");
        double c = input.nextDouble();
        System.out.println("Angle a degrees? ");
        double alp = input.nextDouble();
         double g = Math.toDegrees(Math.asin(c/a*Math.sin(Math.toRadians(alp)))); // Okay for competitors to assume asin argument <= 1
         double g2 = 180-g;
        if (alp+g < 180) { 
            System.out.printf("There are 2 possible values for ∠C: %g & %g.\n", g, g2);
        } else {
            System.out.printf("There is 1 possible value for ∠C: %g.\n", g);
        }
    }
}
