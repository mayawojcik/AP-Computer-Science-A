package Q1;
import java.util.*;

public class LP514 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dice 1\t\tDice 2\t\tTotal");

        double dice11 = (double)Math.random()*6 +1;
        double dice1 = Math.round(dice11 * 1.0) / 1.0;
        double dice22 = (double)Math.random()*6 +1;
        double dice2 = Math.round(dice22 * 1.0) / 1.0;
        double total = dice1 + dice2;
        System.out.println(dice1 + "\t\t\t" + dice2 + "\t\t\t" + total);

    }
}
