package Q1;
import java.util.Scanner;

public class LP43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of eggs purchased: ");
        int eggs = input.nextInt();

        String price = " ";
        if (eggs < 48) price = "$0.50 per dozen";
        else if (eggs < 72) price = "$0.45 per dozen";
        else if (eggs < 132) price = "0.40 per dozen";
        else  price = "0.35 per dozen";

        System.out.println("The bill is equal to " + price);

    }
}
/*
Enter number of eggs purchased: 67
The bill is equal to $0.45 per dozen
 */