package Q1;
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilowatts used: ");
        double kw = input.nextDouble();

        double baserate = (kw * 0.0475);
        System.out.printf("Base Rate: = %.2f\n", baserate);
        double surcharge = (baserate * 0.001) * 100;
        System.out.printf("Surcharge: = %.2f\n", surcharge);
        double citytax = (baserate * 0.0003) * 100;
        System.out.printf("City Tax: = %.2f\n", citytax);
        double payment = (baserate + surcharge + citytax) + 0.01;
        System.out.printf("Pay this amount: = %.2f\n", payment);
        double latefee = (payment * 0.04) + payment;
        System.out.printf("After May 20th pay: = %.2f\n", latefee);

    }
}
/*
Kilowatts used: 993
Base Rate: = 47.17
Surcharge: = 4.72
City Tax: = 1.42
Pay this amount: = 53.31
After May 20th pay: = 55.44
 */