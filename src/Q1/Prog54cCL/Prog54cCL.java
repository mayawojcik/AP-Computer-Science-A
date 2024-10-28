package Q1.Prog54cCL;
import java.util.*;

public class Prog54cCL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        double radius = input.nextDouble();

        CL54c circle = new CL54c(radius);
        circle.calc();

        System.out.println(circle);
    }
}
/*
Enter circle radius:
3.712
The area is: 40.84
The circumference is: 23.32
 */