package Q1;
import java.util.*;

public class LP49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 20: ");
        int num = input.nextInt();
        int comnum = (int)Math.random()*20+ 1;

        String output = "";
        if (num == comnum)  output = "You won!";
        else  output = "Better luck next time!";

        System.out.println("Computer number: " + comnum);
        System.out.println("Player's number: " + num);
        System.out.println(output);
    }
}
/*
Enter a number between 1 and 20: 6
Computer number: 0
Player's number: 6
Better luck next time!
 */