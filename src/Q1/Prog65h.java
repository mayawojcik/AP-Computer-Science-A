package Q1;
import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();

        System.out.print("Enter Shillings: ");
        double Shillings = input.nextDouble();

        System.out.print("Enter pence: ");
        double pence = input.nextDouble();

        double num = (pence / (12*30)) + Shillings / 20;
        double declb = (pounds + num) + 0.01;

        System.out.printf("Decimal pounds: = %.2f\n", declb);


    }
}
/*
Enter pounds: 7
Enter Shillings: 17
Enter pence: 9
Decimal pounds: = 7.89
 */