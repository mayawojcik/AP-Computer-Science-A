package Q1;
import java.util.*;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        int num = input.nextInt();
        System.out.println();

        System.out.print("Please enter next number: ");
        int num2 = input.nextInt();
        System.out.println();

        System.out.print("Please enter third number: ");
        int num3 = input.nextInt();
        System.out.println();

        System.out.print("Please enter fourth number: ");
        int num4 = input.nextInt();
        System.out.println();

        int sum = num + num2 + num3 + num4;
        double average = sum / (double)4;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
/*
Please enter first number: 475
Please enter next number: 821
Please enter third number: 369
Please enter fourth number: 562

Sum = 2227
Average = 556.75
 */