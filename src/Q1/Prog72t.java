package Q1;
import java.util.*;

public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first time: ");
        int time1 = input.nextInt();
        System.out.print("Enter the second time: ");
        int time2 = input.nextInt();
        int time = Math.abs(time2 - time1);
        int num = time / 100;
        int num2 = (int)Math.floor(num);
        int num3 = time - 800;
        System.out.print(num2 + " hours ");
        System.out.print(num3 + " minutes");




    }
}
/*
Enter the first time: 900
Enter the second time: 1730
8 hours 30 minutes
 */