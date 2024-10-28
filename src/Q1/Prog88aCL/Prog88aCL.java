package Q1.Prog88aCL;
import java.util.Scanner;

public class Prog88aCL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        CL88a cal = new CL88a(num1, num2);
        cal.calc();

        System.out.println(cal);


    }
}
