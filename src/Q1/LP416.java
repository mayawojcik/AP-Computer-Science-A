package Q1;
import java.util.*;

public class LP416 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double degree = input.nextDouble();
        double radians = Math.toRadians(degree);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        System.out.println(sine);
        System.out.println(cosine);
        System.out.println(tangent);

    }
}
