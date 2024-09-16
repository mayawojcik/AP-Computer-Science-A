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

        double dollars = (change / 1.0) - 0.68;
        System.out.printf("Dollars: = %.0f\n", dollars);

        double change2 = (change - dollars);
        double quarters = ((change2 / 0.25) - 0.72);
        System.out.printf("Quarters: = %.0f\n", quarters);

        double change3 = (change2 - (quarters * 0.25));
        double dimes = (change3 / 0.10) - 0.80;
        System.out.printf("Dimes: = %.0f\n", dimes);

        double change4 = (change3 - (dimes * 0.10));
        double nickels = (change4 / 0.05) - 0.60;
        System.out.printf("Nickels: = %.0f\n", nickels);

        double change5 = (change4 - (nickels * 0.05));
        double pennies = (change5 / 0.01);
        System.out.printf("Pennies: = %.0f\n", pennies);





    }
}
/*
Enter purchase price: 125.32
Enter amount received: 140
Change due: = 14.68
Dollars: = 14
Quarters: = 2
Dimes: = 1
Nickels: = 1
Pennies: = 3
 */