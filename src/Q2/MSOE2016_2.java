package Q2;
import java.util.*;

public class MSOE2016_2 {
    private static void p2() {
        System.out.println("Side a? ");
        double a = input.nextDouble();
        System.out.println("Side c? ");
        double c = input.nextDouble();
        System.out.println("Angle a degrees? ");
        double alp = input.nextDouble();
         double g = Math.toDegrees(Math.asin(c/a*Math.sin(Math.toRadians(alp)))); // Okay for competitors to assume asin argument <= 1
         double g2 = 180-g;
        if (alp+g < 180) { 
            System.out.printf("Two possible values for angle C: %g & %g.\n", g, g2);
        } else {
            System.out.printf("One possible value for angle C: %g.\n", g);
        }
    }
}
