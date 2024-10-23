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
