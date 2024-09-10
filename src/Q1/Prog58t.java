package Q1;
import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase price: ");
        double price = input.nextDouble();
        System.out.print("Enter amount received: ");
        double amountR = input.nextDouble();

        double change_due = amountR - price;
        double change_dueRounded = Math.round(change_due * 100) / 100.0;

        System.out.printf("Amount due: " + change_dueRounded);

        double dollars = 1;
        double quarters = 0.25;
        double times = 0.10;
        double nickles = 0.05;
        double pennies = 0.01;

    }
}
