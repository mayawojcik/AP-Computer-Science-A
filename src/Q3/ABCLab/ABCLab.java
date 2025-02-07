package Q3.ABCLab;
import java.util.Scanner;

public class ABCLab {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("C radius: " );
        double r = kbd.nextDouble();
        Shape s1 = new Circle(r);

        System.out.print("R height: " );
        double rh = kbd.nextDouble();
        System.out.print("R width: " );
        double rw = kbd.nextDouble();
        Shape s2 = new Rectangle(rh, rw);

        System.out.print("T height: ");
        double th = kbd.nextDouble();
        System.out.print("T base: " );
        double tb = kbd.nextDouble();
        Shape s3 = new Triangle(th, tb);

        ((Circle) s1).printClass();
        s1.calcArea();
        ((Circle) s1).calcCircumference();

        ((Rectangle) s2).printClass();
        s2.calcArea();
        s2.calcPerim();

        ((Triangle) s3).printClass();
        s3.calcArea();
        s3.calcPerim();
    }
}
/*
C radius: 3.712
R height: 5
R width: 10
T height: 13
T base: 21
Circle
Area: 43.287829244625165
Circumference: 23.323183860250627
Rectangle
Area: 50.0
Perimeter: 30.0
Triangle
Area: 136.5
Perimeter: 58.69817807045693
 */