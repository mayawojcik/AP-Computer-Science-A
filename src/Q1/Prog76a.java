package Q1;
import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter digit between 1-9: ");
        int num = input.nextInt();

        int product = num * 9;
        int output = product * 12345679;

        System.out.print(num + "X" + "9");

        System.out.print(output);

    }
}
