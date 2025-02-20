package Q3;
import java.util.Scanner;

public class Prog162aRecursive {
    public static int factLoop(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++)
            product += i;
        return product;
    }

    public static int factReverseLoop(int n) {
        int product = 1;
        for (int i = n; i > 0; i--)
            product += 1;
        return product;
    }

    public static int factorial(int n) {
        if (n <= 1) return 1; // base/ending case(when to stop)
        return n * factorial(n - 1); // recursive case(when to call)
    }

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter a number: " );
        int num = keys.nextInt();
        while (num != 0) {
            int fact = factorial(num);
            System.out.println(num + "! = " + fact);
            System.out.print("Enter a number: " );
            num = keys.nextInt();
        }
    }
}
/*
Enter a number: 12
12! = 479001600
Enter a number: 6
6! = 720
Enter a number: 5
5! = 120
Enter a number: 2
2! = 2
Enter a number: 10
10! = 3628800
Enter a number: 3
3! = 6
Enter a number: 0
 */