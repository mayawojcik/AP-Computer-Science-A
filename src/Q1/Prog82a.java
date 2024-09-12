package Q1;
import java.util.*;

public class Prog82a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Speed Limit: ");
        double sl = input.nextDouble();

        System.out.print("Enter the Vehicle Speed: ");
        double vs = input.nextDouble();

        double fine1 = (vs - sl) * 5;
        double ticket = fine1 + 20.00;
        System.out.printf("Fine: = %.2f\n", ticket);

        // print faster = sou(t)(adds print line), sou(th)(printf)
    }
}
/*
Enter the Speed Limit: 55
Enter the Vehicle Speed: 70
Fine: 95.0
 */