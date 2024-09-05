package Q1;
import java.util.*;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Radius = 3.712;
        double PI = 3.14159;
        double area = PI * (Radius * Radius);
        double circumference = (PI * Radius) * 2;


        System.out.println("Radius = " + Radius);
        System.out.printf("Area = %.3f\n", area);
        System.out.printf("Circumference = %.3f\n", circumference);


        
    }
}
/*
Radius = 3.712
Area = 43.288
Circumference = 23.323
 */