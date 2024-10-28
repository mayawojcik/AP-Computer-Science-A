package Q1.Prog54bCL;
import java.util.Scanner;

public class Prog54bCL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        int num1 = input.nextInt();

        CL54b wow = new CL54b(num1);
        wow.calc();

        System.out.println(wow);

    }
}
/*
475
821
369
562
The sum of the four numbers is 2227
The average of the four numbers is 556.75
 */