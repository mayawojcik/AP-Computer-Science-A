package Q1;
import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase price: ");
        double price = input.nextDouble();
        System.out.print("Enter amount received: ");
        double amountR = input.nextDouble();

        double change = amountR - price;
        System.out.printf("Change due: = %.2f\n", change);

        double dollars = change / 1.00;
        System.out.printf("Dollars: = %.2f\n", dollars);




    }
}
