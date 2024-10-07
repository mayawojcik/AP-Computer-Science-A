package Q1.Prog52aCl;
import java.util.Scanner;

public class Prog52aCl { //Driver Class (main)
    public static void main(String[] args) {
        // input section
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = input.nextInt();
        System.out.print("Enter width: ");
        int w = input.nextInt();

        // Calculation section
        cl52a wow = new cl52a(l, w); // new object of "cl52a" class
        wow.calc(); // don't forget to call calc() or setThing()!
        int area  = wow.getArea();
        int perim = wow.getPerim();

        // output section
        System.out.println("Rectangle area: " + area);
        System.out.println("Rectangle perimeter: " + perim);
    }
}
/*
Enter length: 5
Enter width: 10
Rectangle area: 50
Rectangle perimeter: 30
 */