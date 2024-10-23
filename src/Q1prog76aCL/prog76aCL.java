package Q1prog76aCL;
import java.util.Scanner;

public class prog76aCL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you dislike: ");
        int dislike = input.nextInt();

        CL76a thing = new CL76a(dislike);
        thing.calc();

        System.out.println(thing);
    }
}
