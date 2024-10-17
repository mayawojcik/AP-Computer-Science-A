package Q1;
import java.util.*;

public class LP514 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dice 1\t\tDice 2\t\tTotal");

        int dice1 = ((int)(Math.random()*6) +1);
        int dice2 = ((int)(Math.random()*6) +1);
        int total = dice1 + dice2;
        System.out.println(dice1 + "\t\t\t" + dice2 + "\t\t\t" + total);
        int dice1a = ((int)(Math.random()*6) +1);
        int dice2a = ((int)(Math.random()*6) +1);
        int totala = dice1a + dice2a;
        System.out.println(dice1a + "\t\t\t" + dice2a + "\t\t\t" + totala);
        int dice1b = ((int)(Math.random()*6) +1);
        int dice2b = ((int)(Math.random()*6) +1);
        int totalb = dice1b + dice2b;
        System.out.println(dice1b + "\t\t\t" + dice2b + "\t\t\t" + totalb);
        int dice1c = ((int)(Math.random()*6) +1);
        int dice2c = ((int)(Math.random()*6) +1);
        int totalc = dice1c + dice2c;
        System.out.println(dice1c + "\t\t\t" + dice2c + "\t\t\t" + totalc);
        int dice1d = ((int)(Math.random()*6) +1);
        int dice2d = ((int)(Math.random()*6) +1);
        int totald = dice1d + dice2d;
        System.out.println(dice1d + "\t\t\t" + dice2d + "\t\t\t" + totald);

    }
}
/*
Dice 1		Dice 2		Total
2			2			4
6			3			9
5			1			6
6			4			10
2			3			5
 */