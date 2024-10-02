package Q1;
import java.util.*;

public class LP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of copies to be printed: ");
        double num = input.nextInt();


        String price = "";
        if (num <= 99)       price = "0.30";
        else if (num <= 499) price = "0.28";
        else if (num <= 749) price = "0.27";
        else if (num <= 1000)price = "0.26";
        else                 price = "0.25";


        System.out.println("Price per copy is: " + price);
        System.out.println("Total cost is: ");

    }
}
