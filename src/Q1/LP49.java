package Q1;
import java.util.*;

public class LP49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 20: ");
        double num = input.nextDouble();
        double comnum = (double)Math.random()*20 +1;
        double comnumr = Math.round(comnum * 1.0) / 1.0;

        String output = "";
        if (num == comnumr)  output = "You won!";
        else  output = "Better luck next time!";

        System.out.println("Computer number: " + comnumr);
        System.out.println("Player's number: " + num);
        System.out.println(output);
    }
}
/*
Enter a number between 1 and 20: 12
Computer number: 1.0
Player's number: 12.0
Better luck next time!
 */