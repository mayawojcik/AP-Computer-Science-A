package Q1;
import java.util.*;

public class Prog54a {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // int, double, boolean, String
        System.out.print("Enter the car model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter miles driven: ");
        int miles = keyboard.nextInt();
        // double miles = keyboard.nextDouble();

        System.out.print("Enter gallons used: ");
        int gallons = keyboard.nextInt();

        double mpg = miles / (double)gallons;
        System.out.println("MPG used by " + model + " is " + mpg + "m/g");
        // cast as a double by using (double)

    }
}
/*
Enter the car model: 1970 VW bug
Enter miles driven: 286
Enter gallons used: 9
MPG used by 1970 VW bug is 31.77777777777778m/g
 */